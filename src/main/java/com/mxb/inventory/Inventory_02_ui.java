package com.mxb.inventory;


import org.sikuli.basics.Settings;

// import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.sikuli.script.Pattern;
import org.sikuli.script.Key;

import org.sikuli.script.Region;
// import org.sikuli.script.Match;

import org.sikuli.script.FindFailed;

// ---------------------------------
// import org.sikuli.script.Finder;
// import org.sikuli.script.ImagePath;

// ---------------------------------
// import java.net.URISyntaxException;
// import java.net.URL;
// import java.net.MalformedURLException;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;

// import java.util.*;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Iterator;


/**
 * Hello world!
 *
 */

public class Inventory_02_ui
{
    // private App myApp;

    private Screen scr;
    private String basePath;

    // private String uiTemplate = "TEMPLATExxx";
    private String uiTemplate;
    private String equipment;
    private String port;


    private Region r1Top_GenID;
    private Region r2Bottom;


    // constructor to initialize the variable
    // httpstom.mcqueeney.tech/blog/the-terribly-misunderstood-super/
    public Inventory_02_ui()
    {
        // General Settings and Access to Environment Information
        // https://sikulix-2014.readthedocs.io/en/latest/globals.html
        // Settings.AutoWaitTimeout = 2;  // (default 3 seconds)

        Settings.AutoDetectKeyboardLayout = false;
        Settings.AutoWaitTimeout  = 120;
        scr = new Screen(0);
        // scr.setAutoWaitTimeout(120);

        r1Top_GenID = new Region(0,0,1920,155);
        r2Bottom = new Region(0,939,1920,141);

        // https://www.baeldung.com/java-current-directory
        // Get the Current Working Directory in Java | Baeldung
        String currentWorkingDir = System.getProperty("user.dir");
        basePath = currentWorkingDir + "/images/";

    }


    // instance method
    private void startApp() throws FindFailed
    {
        m1MaximizeApp();
        m2OpenPath();
        m3Insert_EQ();
        m4SelectPort();
    }


    // instance method
    private void m1MaximizeApp() throws FindFailed
    {
        // Java 1.8
        // By default, float numbers are double in java.
        // In order to store them into float variable, you need to explicitly add the suffix 'f' or 'F'.
        // scr.wait(p3Search_For_Path.similar(0.7F));

        try {
            // INV app, Click on the icon
            // Pattern p1AppIcon = new Pattern("C:\\xxx\\INV_01_ikona.png");
            Pattern p1AppIcon = new Pattern(basePath + "p1AppIkona.png");
            r2Bottom.click(p1AppIcon.similar(0.8));

            // myApp = new App("Inventory");
            // myApp.focus();

            // INV app, Wait for it to open
            Pattern p2AppWait = new Pattern(basePath + "p2AppWait.png");
            r1Top_GenID.wait(p2AppWait.similar(0.8));

        } catch(FindFailed e) {
            e.printStackTrace();
            System.out.println("Find failed " + e.getMessage());
            System.exit(1);
        }

    }


    // instance method
    private void m2OpenPath() throws FindFailed
    {

        try {
            // INV: Equipment - Slot/Card
            scr.type("o", Key.ALT);   // Menu - Object
            scr.wait(0.1);   // wait 0.1 seconds
            scr.type("p");   // Path

            // ---------------------------------
            Pattern p3Search_For_Path = new Pattern(basePath + "p3Search_For_Path.png");
            r1Top_GenID.wait(p3Search_For_Path.similar(0.7));
            System.out.println("found p3Search_For_Path");

            scr.type("a", Key.CTRL);   // Select All
            scr.wait(0.1);
            scr.type(Key.DELETE);

            scr.wait(0.5);
            scr.paste(uiTemplate);
            scr.type(Key.ENTER);

            // ---------------------------------
            Pattern p4SearchResults = new Pattern(basePath + "p4SearchResults.png");
            r1Top_GenID.wait(p4SearchResults.similar(0.7));
            System.out.println("found p4SearchResults");

            r1Top_GenID.doubleClick(p4SearchResults.similar(0.7).targetOffset(100, 48));

            // ---------------------------------
            r1Top_GenID.waitVanish(p4SearchResults.similar(0.7));

            Pattern p5ViewPath = new Pattern(basePath + "p5ViewPath.png");
            r1Top_GenID.wait(p5ViewPath.similar(0.7));
            System.out.println("found p5ViewPath");

            scr.type("m", Key.CTRL);   // Modify
            scr.wait(0.5);

            // ---------------------------------
            r1Top_GenID.waitVanish(p5ViewPath.similar(0.7));

            Pattern p6ModifyPath = new Pattern(basePath + "p6ModifyPath.png");
            r1Top_GenID.wait(p6ModifyPath.similar(0.7));
            System.out.println("found p6ModifyPath");

            // scr.wait(1.0);   // wait 1 second
            scr.wait(0.1);

            // ---------------------------------
            // INV: Equipment - Slot/Card
            scr.type("p", Key.ALT);   // Menu - Operations
            scr.wait(0.1);   // wait 0.1 seconds
            scr.type("w");   // Save As New

            // ---------------------------------
            Pattern p7New_UI_name = new Pattern(basePath + "p7New_UI_name.png");
            scr.wait(p7New_UI_name.similar(0.7));
            System.out.println("found p7New_UI_name");

            scr.type(Key.TAB);
            scr.wait(0.1);
            scr.type(Key.TAB);
            scr.wait(0.1);
            scr.type(Key.ENTER);
            scr.wait(0.1);

            // ---------------------------------
            scr.waitVanish(p7New_UI_name.similar(0.7));

            // ---------------------------------
            scr.wait(1.0);  // wait 5 seconds

        } catch(FindFailed e) {
            e.printStackTrace();
            System.out.println("Find failed " + e.getMessage());
            System.exit(1);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Some other exception occured " + e.getMessage());
        }

    }


    // instance method
    private void m3Insert_EQ() throws FindFailed
    {

        try {
            // ---------------------------------
            scr.wait(0.1);
            Pattern p8Insert_EQ = new Pattern(basePath + "p8Insert_EQ.png");
            scr.click(p8Insert_EQ.similar(0.8).targetOffset(0,10));
            System.out.println("found p8Insert_EQ");

            scr.wait(0.5);
            scr.type(Key.DOWN);
            scr.wait(0.1);
            scr.type(Key.ENTER);
            scr.wait(0.1);

            // ---------------------------------
            Pattern p9SelectShelf = new Pattern(basePath + "p9SelectShelf.png");
            scr.wait(p9SelectShelf.similar(0.7));
            System.out.println("found p9SelectShelf");


            // #################################
            // scr.wait(2.0);   // wait 2 seconds

            scr.wait(1.0);
            scr.type(Key.PAGE_DOWN, Key.CTRL);
            scr.wait(0.1);
            scr.type(Key.PAGE_DOWN, Key.CTRL);
            scr.wait(0.1);

            // #################################

            Pattern p10Shelf_port = new Pattern(basePath + "p10Shelf_port.png");
            scr.wait(p10Shelf_port.similar(0.7));
            System.out.println("found p10Shelf_port");

            // scr.wait(3.0);
            scr.wait(0.5);

            // ---------------------------------
            scr.click(p10Shelf_port.similar(0.7).targetOffset(90, -2));
            scr.paste(port);
            scr.wait(0.1);

            // Pattern p11Port = new Pattern(basePath + "p11Port.png");
            // scr.waitVanish(p11Port.similar(0.88));

            // ---------------------------------
            scr.click(p10Shelf_port.similar(0.7).targetOffset(410, 33));
            scr.wait(0.1);
            scr.paste(equipment);
            scr.wait(0.5);   // čekaj 0.5 sekundi
            scr.type(Key.ENTER);

            // ---------------------------------
            Pattern p12Shelf_search_results = new Pattern(basePath + "p12Shelf_search_results.png");
            scr.wait(p12Shelf_search_results.similar(0.7));
            System.out.println("found p12Shelf_search_results");

            scr.doubleClick(p12Shelf_search_results.targetOffset(60, 77));

            // ---------------------------------

        } catch(FindFailed e) {
            e.printStackTrace();
            System.out.println("Find failed " + e.getMessage());
            System.exit(1);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Some other exception occured " + e.getMessage());
        }

    }


    // instance method
    private void m4SelectPort() throws FindFailed
    {

        try {
            // INV: Port- priprema rednog broja u slotu
            Pattern p13Select_port = new Pattern(basePath + "p13Select_port.png");
            scr.wait(p13Select_port);
            System.out.println("found p13Select_port");

            scr.doubleClick(p13Select_port.similar(0.7).targetOffset(80, 255));

            // ---------------------------------
            scr.waitVanish(p13Select_port.similar(0.7));
            Pattern p14Save = new Pattern(basePath + "p14Save.png");

            scr.type("s", Key.CTRL);   // Save
            scr.waitVanish(p14Save.similar(0.9));

            // ---------------------------------
            scr.type("a", Key.CTRL);   // Select All
            scr.wait(0.1);
            scr.type("x", Key.CTRL);   // Cut
            scr.wait(1.0);

            Pattern p15Gen_IDa = new Pattern(basePath + "p15Gen_IDa.png");
            r1Top_GenID.wait(p15Gen_IDa.similar(0.7));
            System.out.println("found p15Gen_IDa");

            r1Top_GenID.click(p15Gen_IDa.similar(0.7).targetOffset(-20, 0));

            // ---------------------------------
            Pattern p16Temp_path_name = new Pattern(basePath + "p16Temp_path_name.png");
            scr.wait(p16Temp_path_name.similar(0.7));
            System.out.println("found p16Temp_path_name");

            scr.type("v", Key.CTRL);   // Paste
            scr.wait(0.1);
            scr.type(Key.TAB);
            scr.wait(0.1);
            scr.type(Key.ENTER);

            // ---------------------------------
            scr.waitVanish(p16Temp_path_name.similar(0.7));
            scr.type("a", Key.CTRL);   // Select All
            scr.wait(0.1);
            scr.type("c", Key.CTRL);   // Copy
            scr.wait(0.1);
            scr.type("s", Key.CTRL);   // Save

            // ---------------------------------
            scr.waitVanish(p14Save.similar(0.9));
            // scr.type(Key.F4, Key.CTRL);   // Close

        } catch(FindFailed e) {
            e.printStackTrace();
            System.out.println("Find failed " + e.getMessage());
            System.exit(1);
        }

    }


   // this is a static method and cannot call an instance method without a object
    public static void main(String[] args) throws FindFailed
    {
        System.out.println( "Hello World!" );
        // create instance of object
        Inventory_02_ui uiObj = new Inventory_02_ui();

        // Windows bat file: Pokreni_inventory_02_UI.bat
        // set UITEMPLATE=%1
        // set EQUIPMENT=%2
        // set PORT=%3
        uiObj.uiTemplate = args[0].toString();
        uiObj.equipment = args[1].toString();
        uiObj.port = args[2].toString();

        uiObj.startApp();
    }


}

