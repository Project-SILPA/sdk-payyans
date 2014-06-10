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

#### Payyans EditText using XML 
```  
       
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:payyans="http://schemas.android.com/apk/res-auto"
            android:orientation="vertical"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        
            <org.silpa.payyans.PayyansEditText
                android:id="@+id/edtPayyansInput"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                payyans:directionOfConversion="ASCIIToUnicode"
                payyans:fontMap="ambili"
                payyans:outputField="@+id/tvPayyansOutput" />
        
            <TextView
                android:id="@+id/tvPayyansOutput"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content" />
        
        </LinearLayout>
```

Using this edit text , the text from one EditText can be converted from Unicode to ASCII and vice-versa, using a
specified font map and the result can be outputted to another EditText or TextView. 

Possible values for attribute `payyans:directionOfConversion` are : 

``` 

        ASCIIToUnicode  - to convert from ASCII to Unicode        
        UnicodeToASCII  - to convert from Unicode to ASCII

```

Possible values for attribute `payyans:fontMap` are : 

``` 

        ambili
        charaka
        haritha
        indulekha
        karthika
        manorama
        matweb
        nandini
        panchari
        revathi
        template
        uma
        valluvar

```

Possible values for attribute `payyans:outputField` are :  resource id of EditText or TextView


#### Payyans EditText using XML 

Payyans EditText parameters can also be defined explicitly if required.

```         
        <org.silpa.payyans.PayyansEditText
                android:id="@+id/edtPayyansInput"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content" />
```

and use in Java

```         
        PayyansEditText edtPayyans = (PayyansEditText) view.findViewById(R.id.edtPayyansInput);
        edtPayyans.setFontMap(Payyans.FONT_MAP_KARTHIKA);
        edtPayyans.setDirection(Payyans.UNICODE_TO_ASCII);
        edtPayyans.setOutputField(R.id.tvPayyansOutput);
```

PayyansEditText can also be set to use a Payyans object for conversion. For eg : 

```
                
        Payyans obj = new Payyans(getActivity(), Payyans.FONT_MAP_NANDINI, Payyans.UNICODE_TO_ASCII);
        PayyansEditText edtPayyans = (PayyansEditText) view.findViewById(R.id.edtPayyansInput);
        edtPayyans.setPayyans(obj);
        edtPayyans.setOutputField(R.id.tvPayyansOutput);
        
```

#### To run tests
Tests present at `/src/test/java/`

  - Select test to run
  - Right Click -> Run Test -> Run as Android Test

