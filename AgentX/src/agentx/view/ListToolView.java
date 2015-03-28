///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package agentx.view;
//
//import agentx.model.Tool;
//import agentx.view.ViewInterface.View;
//import java.io.FileWriter;
//import java.util.ArrayList;
//
///**
// *
// * @author matiasmikkola
// */
//public class ListToolView extends View {
//    
//    ListToolView(){
//        super("Please enter the file path to save your list.");
//    }
//
//    
//   @Override
//    public boolean doAction(Object obj){
//        
//        String filePath = (String) obj;
//        ArrayList<Tool> ListTools = agentx.control.GameControl.createToolList();
//        
//        try (FileWriter fw = new FileWriter(filePath, false)) {
//            fw.write("QUANTITY         NAME");
//            try {
//                for (int i = 0; i < toolList)
//            }
//        }
//        
//        return true;
//    
//}
//}

