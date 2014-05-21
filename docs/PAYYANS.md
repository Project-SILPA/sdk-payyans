Usage
=====

### Note :
This module is still under development and this document presently shows only currently available utilities.

#### Creating object
```
Payyans obj = new Payyans(getContext());
Payyans obj = new Payyans(getContext(), Payyans.FONT_MAP_AMBILI);
Payyans obj = new Payyans(getContext(), Payyans.FONT_MAP_AMBILI, Payyans.ASCII_TO_UNICODE);

```
The code demonstrates on how to create a Payyans object. If no font map or direction is specified default values taken are `Payyans.FONT_MAP_AMBILI` and `Payyans.ASCII_TO_UNICODE` by default.

Font map and direction can also be changed by setFontMap() and setDirection(). Example :
```
// for setting font map
obj.setFontMap(Payyans.FONT_MAP_AMBILI);

// for setting direction of conversion
obj.setDirection(Payyans.ASCII_TO_UNICODE); or obj.setDirection(Payyans.UNICODE_TO_ASCII); 
```

Other font maps available are :
```
FONT_MAP_AMBILI 
FONT_MAP_CHARAKA
FONT_MAP_HARITHA 
FONT_MAP_INDULEKHA 
FONT_MAP_KARTHIKA 
FONT_MAP_MANORAMA 
FONT_MAP_MATWEB 
FONT_MAP_NANDINI 
FONT_MAP_PANCHARI 
FONT_MAP_REVATHI 
FONT_MAP_TEMPLATE 
FONT_MAP_UMA 
FONT_MAP_VALLUVAR 
```


#### Get converted Text
```
Payyans obj = new Payyans(getContext(), Payyans.FONT_MAP_AMBILI, Payyans.ASCII_TO_UNICODE);
String unicodeText =  obj.getConvertText("The quick brown fox jumps over the lazy dog");
    
Payyans obj = new Payyans(getContext(), Payyans.FONT_MAP_AMBILI, Payyans.UNICODE_TO_ASCII);
String asciiText = obj.getConvertText("ഠവല ൂൗശരസ യൃീംി ളീഃ ഷൗാു ീെ്‌ലൃ വേല ഹമ്വ്യ റീഴ");
```

The above function accepts texts and converts it as per flags given.

#### Get module name and information
```
String moduleName = obj.getModuleName();
String moduleInforamtion =  obj.getModuleInformation();
```

#### To run tests

  - Select test to run
  - Right Click -> Run Test -> Run as Android Test

