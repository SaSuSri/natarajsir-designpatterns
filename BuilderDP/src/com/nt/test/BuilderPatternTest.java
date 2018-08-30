package com.nt.test;

import com.nt.bdp.CivilEngineer;
import com.nt.bdp.CivilEngineerCouncil;
import com.nt.bdp.House;

public class BuilderPatternTest {
   public static void main(String[] args) {
	   CivilEngineer engg1=null,engg2=null,engg3=null;
	   House iglooHouse=null,woodHouse=null,brickHouse=null;
	  //get Civil Engineer for IglooHouse
	   engg1=CivilEngineerCouncil.getInstance("igloo");
	   iglooHouse=engg1.constructHouse();
	   System.out.println(iglooHouse);
	   System.out.println("..................................");
     //get Civil Engineer for Woode House
	   engg2=CivilEngineerCouncil.getInstance("wood");
	   woodHouse=engg2.constructHouse();
	   System.out.println(woodHouse);
	   System.out.println("..................................");
	   //get Civil Engineer for Brick House
	   engg3=CivilEngineerCouncil.getInstance("brick");
	   brickHouse=engg3.constructHouse();
	   System.out.println(brickHouse);
	   System.out.println("..................................");
   }//main
}//class
