/*
 * MalignancyTagger
 * 
 * Copyright (c) 2011, The University of Sheffield.
 * 
 * This file is part of GATE (see http://gate.ac.uk/), and is free software,
 * licenced under the GNU Library General Public License, Version 3, June 2007
 * (in the distribution as file licence.html, and also available at
 * http://gate.ac.uk/gate/licence.html).
 * 
 * Mark A. Greenwood, 02/06/2011
 */
package gate.creole.pennbio;

import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

import java.net.URL;

@CreoleResource(name = "Penn BioTagger: Malignancy", icon = "bio.png",
    comment = "Penn BioTagger for malignancy types")
public class MalignancyTagger extends AbstractTagger {

  public MalignancyTagger() {
    type = "mal";
  }

  @CreoleParameter(defaultValue="resources/malignancyModel.crf.gz")
  public void setModelURL(URL modelURL) {
    this.modelURL = modelURL;
  }
}
