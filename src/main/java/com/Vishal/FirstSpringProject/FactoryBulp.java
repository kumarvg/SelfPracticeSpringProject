package com.Vishal.FirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;

// Here we 
public class FactoryBulp {
	
	public FactoryBulp() {

	System.out.println("Factory bulb constructer called");
	
	}
	public static FactoryBulp factMethod()
	{
		System.out.println("Factory Method Called");
		FactoryBulp Fp=new FactoryBulp();
		Fp.wireMaterial="Tungestan";
		Fp.tubeLightGas="Nitrogen";
		return Fp;
		
	}
	
	Bulb bulb;// = new SuryaBulb();
	Tubelight tubelight;
	String wireMaterial;
	String tubeLightGas;
	
	
	/*
	 * public FactoryBulp(Bulb bulb, Tubelight tubelight, String wireMaterial,String
	 * tubeLightGas) { super(); this.bulb = bulb; this.tubelight = tubelight;
	 * this.wireMaterial = wireMaterial; this.tubeLightGas = tubeLightGas; }
	 */

	
	
	/*
	 * public String getWireMaterial() { return wireMaterial; } public void
	 * setWireMaterial(String wireMaterial) { this.wireMaterial = wireMaterial; }
	 * public String getTubeLightGas() { return tubeLightGas; } public void
	 * setTubeLightGas(String tubeLightGas) { this.tubeLightGas = tubeLightGas; }
	 */
	  
	  public Tubelight getTubelight() 
	  { return tubelight; } 
	  public void setTubelight(Tubelight tubelight) 
	  { this.tubelight = tubelight; } 
	  
	  public Bulb getBulb() { return bulb; }
	  public void setBulb(Bulb bulb) { this.bulb = bulb;}
	 
	
	ServiceToFactory factoryservice = new ServiceToFactory();

	public void verify() {
		factoryservice.bulbService(bulb);
	}
	
	
	 
	 
	public void tubeLightService() {
		factoryservice.tubeLightService(tubelight);
		System.out.println("Material Used In Bulb "+ wireMaterial +" Which Is Tested By Electronic Lab");
		System.out.println("Gas Used In Bulb "+ tubeLightGas +" Which Will not Harm Human As Well Environment");


	}

	 public void init() 
	  { 
		  System.out.println("Initialization method call"); 
		  }
	

}
