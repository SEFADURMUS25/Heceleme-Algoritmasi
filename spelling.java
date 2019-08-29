 public static String spelling(String word){
                //word kelimesi sesli harfler için "u" sessiz harfler için "s" düzeltmesi yapýlmýþ halidir.
                for(int i=0;i<word.length();i++){                    
                       // System.out.println("Harf: "+word.charAt(i)+"     "+isSesliHarf(""+word.charAt(i)));
                       if(isBosluk(""+word.charAt(i))){
                                       
                                               return word = word.substring(0, i+1)+"-"+spelling(word.substring(i+1, word.length()));                                              
                                        }                          
                       
                       if(isSesliHarf(""+word.charAt(i))){
                                try{
                                       if(isBosluk(""+word.charAt(i+1))){
                                              
                                               return word = word.substring(0, i+1)+"-"+" "+"-"+spelling(word.substring(i+2, word.length()));
                                               
                                        }else if(isSesliHarf(""+word.charAt(i+1))){
                                            
                                                return word=word.substring(0, i+1)+"-"+spelling(word.substring(i+1, word.length()));
                                       
                                        }else if(isSesliHarf(""+word.charAt(i+2))){
                                       
                                                return word=word.substring(0, i+1)+"-"+spelling(word.substring(i+1, word.length()));
                                        
                                        }else if(isSesliHarf(""+word.charAt(i+3))){
                                            
                                                return word=word.substring(0, i+2)+"-"+spelling(word.substring(i+2, word.length()));
                                        
                                        }else if(word.subSequence(i+1, i+4)=="str" || word.subSequence(i+1, i+4)=="ktr" || word.subSequence(i+1, i+4)=="ntr"){
                                        
                                                return word=word.substring(0, i+2)+"-"+spelling(word.substring(i+2, word.length()));
                                        
                                        }else if(isBosluk(""+word.charAt(i+2))){
                                       
                                               return word = word.substring(0, i+2)+"-"+" "+"-"+spelling(word.substring(i+3, word.length()));
                                               
                                        }else if(isBosluk(""+word.charAt(i+3))){
                                       
                                               return word = word.substring(0, i+3)+"-"+" "+"-"+spelling(word.substring(i+4, word.length()));
                                               
                                        }else if(isBosluk(""+word.charAt(i+4))){
                                       
                                               return word = word.substring(0, i+4)+"-"+" "+"-"+spelling(word.substring(i+5, word.length()));
                                               
                                        } else {
                                        
                                                return word=word.substring(0, i+3)+"-"+spelling(word.substring(i+3, word.length()));
                                        
                                        }
                                        
                                }catch(StringIndexOutOfBoundsException e){
                                        return word;
                                }
                        }
                          
                }
                return word;
        }

        public static  boolean isSesliHarf(String harf){
                String[] arraySesliHarf={"a","e","ý","i","o","ö","u","ü"};
                return Arrays.asList(arraySesliHarf).contains(harf);
        }
        
        public static  boolean isBosluk(String harf){
                String[] arraySesliHarf={" "};
                return Arrays.asList(arraySesliHarf).contains(harf);
        }