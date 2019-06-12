package org.aksw.mvn_import_test;
import org.apache.jena.rdf.model.ModelFactory;


class Main {
  public static void main(String[] args) {
    System.out.println("" + ModelFactory.createDefaultModel().createResource());
  }
}

