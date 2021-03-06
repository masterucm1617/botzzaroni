package botzzaroni.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import botzzaroni.model.User;
import botzzaroni.service.SecurityService;
import botzzaroni.service.UserService;
import botzzaroni.validator.UserValidator;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm,
            BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autologin(userForm.getUsername(),
                userForm.getPasswordConfirm());

        return "redirect:/chat";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error",
                    "El usuario o la contraseña son inválidos.");

        if (logout != null)
            model.addAttribute("message",
                    "Se ha cerrado la sesión satisfactoriamente.");

        return "login";
    }

    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "redirect:/chat";
    }

    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public ModelAndView detailedReport(HttpSession session, Model model,
            HttpServletRequest request) {
        // String apps = (String) session.getAttribute("grafo");
        ModelAndView mav = new ModelAndView("chat");
        // mav.addObject("grafo", apps);
        //
        // GraphInfo graphInfo = (GraphInfo) session.getAttribute("graphlinks");
        // mav.addObject("graphlinks", graphInfo);

        return mav;
    }
}
