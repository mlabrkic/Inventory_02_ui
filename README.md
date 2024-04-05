# Inventory_02_ui

About:  
My Java application that is called from the https://github.com/mlabrkic/my_office_excel_app


---------------------------------
08.10.2020.

https://github.com/RaiMan/SikuliX1  
SikuliX, Java  
Source and target level for Java is version 8 as long as supported by Oracle

https://launchpad.net/sikuli/sikulix  
Downloads (SikuliX IDE): Latest version is 2.0.5  
sikulixide-2.0.5-win.jar

https://answers.launchpad.net/sikuli  
Questions for SikuliX

http://sikulix.com/  
http://sikulix.com/quickstart/

---------------------------------
0) SikuliX IDE

Latest:  
https://github.com/RaiMan/SikuliX1/releases/tag/2.0.5-final  
==>  
[Download ready to use artifacts](https://raiman.github.io/SikuliX1/downloads.html)(SikuliX Downloads)  
Systemspecific versions of the SikuliX IDE:  
Windows: Download the ready to use sikulixide-2.0.5-win.jar (SikuliX IDE for Windows)

SikuliX-IDE, Run:  
`C:\xxx\JDK\bin\java -jar C:\xxx\sikulixide-2.0.5-win.jar`

or  
Run_sikulixide.bat:  
`%java_home%bin\java -jar sikulixide-2.0.5-win.jar`

---------------------------------
1) SikuliX Documentation

http://sikulix-2014.readthedocs.org/en/latest/index.html  
Be aware: The online javadocs are created from the latest nightly builds.

Try the Table of Contents  
https://sikulix-2014.readthedocs.io/en/latest/toc.html

Look through the Index  
https://sikulix-2014.readthedocs.io/en/latest/genindex.html

Use the Search Page  
https://sikulix-2014.readthedocs.io/en/latest/search.html

---------------------------------
2) SikuliX Documentation (built-in class)

Look through the Index:  
https://sikulix-2014.readthedocs.io/en/latest/genindex.html

(built-in class) :  
https://sikulix-2014.readthedocs.io/en/latest/appclass.html#App  
https://sikulix-2014.readthedocs.io/en/latest/screen.html#Screen  
https://sikulix-2014.readthedocs.io/en/latest/pattern.html#Pattern  
https://sikulix-2014.readthedocs.io/en/latest/keys.html#Key  
https://sikulix-2014.readthedocs.io/en/latest/region.html#Region  
https://sikulix-2014.readthedocs.io/en/latest/match.html#Match

https://sikulix-2014.readthedocs.io/en/latest/finder.html#Finder.find

image-search-path  
https://sikulix-2014.readthedocs.io/en/latest/scripting.html#image-search-path-where-sikulix-looks-for-image-files

FindFailed  
https://sikulix-2014.readthedocs.io/en/latest/region.html?highlight=FindFailed#exception-findfailed

https://sikulix-2014.readthedocs.io/en/latest/region.html#extracting-text-from-a-region

`import org.sikuli.script.Pattern;   # SikuliX, Java`

---------------------------------
3) SikuliX Documentation (other)

https://sikulix-2014.readthedocs.io/en/latest/region.html#Region.findAll  
https://sikulix-2014.readthedocs.io/en/latest/match.html#iteratingmatches  

https://stackoverflow.com/questions/47467133/how-to-check-in-sikuli-that-image-is-exist-in-screen-or-not-and-perform-if-else  
Because that will return a "match" object.

https://stackoverflow.com/questions/811851/how-do-i-read-input-character-by-character-in-java  
http://eugenesautomation.blogspot.com/2015/01/optimizing-pattern-matching-using-sikuli_21.html

---------------------------------
4) SikuliX issues

SikuliX 2.0.2:  screen.Paste and Key. dont work  
https://github.com/RaiMan/SikuliX1/issues/305  
https://github.com/RaiMan/SikuliX1/issues/241  

As long as English (United States) is in my language list, it works fine.  
==>  
`Settings.AutoDetectKeyboardLayout = false;`

---------------------------------
5) QUICKSTART

https://sikulix-2014.readthedocs.io/en/latest/faq/030-java-dev.html  
http://www.gofreetodream.com/java-sikulix-windows-mac/java-sikulix-example-on-windows-machine/  
https://javapointers.com/tutorial/sikuli/sikuli-java-tutorial-and-example/

---------------------------------
6) JAVA

https://kodejava.org/how-do-i-load-file-from-resources-directory/  
https://www.geeksforgeeks.org/throw-throws-java/

https://www.baeldung.com/java-current-directory  
Get the Current Working Directory in Java | Baeldung

https://www.baeldung.com/java-system-exit  
`System.exit(0);`


---------------------------------
7) SikuliX OCR

https://sikulix-2014.readthedocs.io/en/latest/textandocr.html#textandocr  
Simply start using the text/OCR features with Region or Image (see the summary below).

https://github.com/RaiMan/SikuliX1/wiki/How-to-get-the-best-from-OCR-and-text-features  

https://github.com/tesseract-ocr/tesseract  
https://mvnrepository.com  
tess4j

https://sikulix-2014.readthedocs.io/en/latest/region.html#extracting-text-from-a-region

```java
import org.sikuli.script.OCR;

Settings.OcrDataPath = "C:\\xxx\\Tesseract-OCR\\tessdata\\";
Settings.OcrTextSearch = true;
Settings.OcrTextRead = true;
OCR.PSM.SINGLE_WORD; !?
```

---------------------------------
https://github.com/suniljayaprakash/sikuli-ocr/blob/master/com/nanni/ExtractTextFromImageSikuli.java  
https://github.com/sarxos/sikuli-ocr


