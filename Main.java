class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Insert Encryption Key");
    String EncryptionKey = "";
    EncryptionKey = Input.readString().toLowerCase();
    System.out.println(encode(EncryptionKey));
    
    System.out.println("Insert Decryption Key");
    String DecryptionKey = "";
    String encodedtxt = encode(EncryptionKey);
    DecryptionKey = Input.readString().toLowerCase();
    System.out.println(decode(DecryptionKey, encodedtxt));
  }
  
  String encode(String EncryptionKey){
    int x = 0;
    int y = 0;
    String txt = Input.readFile("EncodeThisMessage.txt");
    String VRBL_e1A = "";
    String buildU = "";
    String[] reverseKeys = {"a", "e", "i", "o", "u", "y"};
    String[] saladKeys = {"k", "l", "z", "v", "w", "x"};
    String[] cooKeys = {"b", "c", "d", "g", "p", "s"};
    String[] notKeys = {"f", "h", "t", "m", "n", "r"};
    String[] rejectKeys = {"j", "q"}; //These Keys be ugly, no cap dawg 
    while(x<EncryptionKey.length()){
        //Loops the key arrays
        if(y>5){
            y = 0;
        }
        
        VRBL_e1A = EncryptionKey.substring(x, x+1);
        if(VRBL_e1A.equals(reverseKeys[y])){
            txt = encodeLayerLust(txt);
            x++;
        } else if(VRBL_e1A.equals(saladKeys[y])){
            txt = encodeLayerLimbo(txt);
            x++;
        } else if(VRBL_e1A.equals(cooKeys[y])){
            txt = encodeLayerGluttony(txt);
            x++;
        } else if(VRBL_e1A.equals(notKeys[y])){
            txt = encodeLayerGreed(txt);
            x++;
        }
        y++;
    }
    return txt;
  }
  
  String decode(String DecryptionKey, String encodedtxt){
    
    int x = 0;
    int y = 0;
    int z = DecryptionKey.length();
    String VRBL_e1A = "";
    String eencodedtxt = encodedtxt;
    String DeDecryptionKey = "";
    String[] reverseKeys = {"a", "e", "i", "o", "u", "y"};
    String[] saladKeys = {"k", "l", "z", "v", "w", "x"};
    String[] cooKeys = {"b", "c", "d", "g", "p", "s"};
    String[] notKeys = {"f", "h", "t", "m", "n", "r"};
    String[] rejectKeys = {"j", "q"}; //These Keys be ugly, no cap dawg 
    
    while(z>0){
        DeDecryptionKey += DecryptionKey.substring(z-1, z);
        z--;
    }
    while(x<DeDecryptionKey.length()){
        //Loops the key arrays
        if(y>5){
            y = 0;
        }
        
        VRBL_e1A = DeDecryptionKey.substring(x, x+1);
        if(VRBL_e1A.equals(reverseKeys[y])){
            eencodedtxt = encodeLayerLust(eencodedtxt);
            x++;
        } else if(VRBL_e1A.equals(saladKeys[y])){
            eencodedtxt = encodeLayerAntiLimbo(eencodedtxt);
            x++;
        } else if(VRBL_e1A.equals(cooKeys[y])){
            eencodedtxt = encodeLayerAntiGluttony(eencodedtxt);
            x++;
        } else if(VRBL_e1A.equals(notKeys[y])){
            eencodedtxt = encodeLayerGreed(eencodedtxt);
            x++;
        }
        y++;
    }
    return eencodedtxt;
  }
  
  String encodeLayerLimbo(String txt){
    int x = 0;
    int y = 0;
    String VRBL_eLi1A = "";
    String build = "";
    while(x<txt.length()){
        VRBL_eLi1A = txt.substring(x, x+1);
        if(y%2==1){
            build += asciinator3Plus(VRBL_eLi1A);
            x++;
        } else if(y%2==0){
            build += asciinator2Minus(VRBL_eLi1A);
            x++;
        }
        y++;
    }
    return build;
  }
  
  String encodeLayerAntiLimbo(String txt){
    int x = 0;
    int y = 0;
    String VRBL_eALi1A = "";
    String build = "";
    while(x<txt.length()){
        VRBL_eALi1A = txt.substring(x, x+1);
        if(y%2==1){
            build += asciinator3Minus(VRBL_eALi1A);
            x++;
        } else if(y%2==0){
            build += asciinator2Plus(VRBL_eALi1A);
            x++;
        }
        y++;
    }
    return build;
  }

  String encodeLayerLust(String txt){
    //editors note, lust is the same no matter which way
    int x = txt.length();
    String VRBL_eLu1A = "";
    String build = "";
    while(x>0){
        VRBL_eLu1A = txt.substring(x-1, x);
        build += VRBL_eLu1A;
        x--;
    }
    return build;
  }

  String encodeLayerGluttony(String txt){
      int x = 0;
      char VRBL_eGl1A = '\0';
      int VRBL_eGl1B = 0;
      char VRBL_eGl1C = '\0';
      String build = "";
      while(x<txt.length()){
          VRBL_eGl1A=txt.charAt(x);
          VRBL_eGl1B=(int)VRBL_eGl1A + 176;
          VRBL_eGl1C=(char)VRBL_eGl1B;
          build += VRBL_eGl1C;
          x++;
      }
      return build;
  }
  
  String encodeLayerAntiGluttony(String txt){
      int x = 0;
      char VRBL_eGl1A = '\0';
      int VRBL_eGl1B = 0;
      char VRBL_eGl1C = '\0';
      String build = "";
      while(x<txt.length()){
          VRBL_eGl1A=txt.charAt(x);
          VRBL_eGl1B=(int)VRBL_eGl1A - 176;
          VRBL_eGl1C=(char)VRBL_eGl1B;
          build += VRBL_eGl1C;
          x++;
      }
      return build;
  }
  
  String encodeLayerGreed(String txt){
      int x = 0;
      String build = "";
      
      
      build+=txt.substring(txt.length()/2,txt.length());
      build+=txt.substring(0, txt.length()/2);
      return build;
  }
  String asciinator3Plus(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      
      if(ascii == 90){
        ascii = 67;
      }
      else if( ascii == 89){
        ascii = 66;
      }
      else if( ascii == 88){
        ascii = 65;
      }
      else{
        ascii+=3;
      }
      bld+= (char)ascii;
    }
     
    return bld;
  }
  String asciinator3Minus(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      
      if(ascii == 67){
        ascii = 90;
      }
      else if( ascii == 66){
        ascii = 89;
      }
      else if( ascii == 65){
        ascii = 88;
      }
      else{
        ascii-=3;
      }
      bld+= (char)ascii;
    }
     
    return bld;
  }
  
  String asciinator2Minus(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      
      if(ascii == 66){
        ascii = 90;
      }
      else if( ascii == 65){
        ascii = 89;
      }
      else{
        ascii-=2;
      }
      bld+= (char)ascii;
    }
     
    return bld;
  }
  
  String asciinator2Plus(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      
      if(ascii == 90){
        ascii = 66;
      }
      else if( ascii == 89){
        ascii = 65;
      }
      else{
        ascii+=2;
      }
      bld+= (char)ascii;
    }
     
    return bld;
  }

  
  int indexOf(char ch, char[] arry){
    for(int x=0; x<=arry.length-1; x++){
      if(arry[x]==ch){
        return x;
      }
    }
    return -1;
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}