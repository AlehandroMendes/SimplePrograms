/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacaoestudar;

import java.util.Scanner;

public class FundacaoEstudar {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner pergunta = new Scanner(System.in);
                String saida="";
                int nPlacas=pergunta.nextInt();
                for(int i=1;i<=nPlacas;i++){
                    
                    int number = pergunta.nextInt();
                    
                    for(int newNumber=number;newNumber>0;){
                        
                        if(newNumber>=1000){
                            newNumber-=1000;
                            saida+="M";
                        }else if((newNumber>=500)&&(newNumber<1000)){
                            if(newNumber>=900){
                                newNumber-=900;
                                saida+="CM";
                            }else{
                                newNumber-=500;
                                saida+="D";   
                            }
                        }else if((newNumber>=100)&&(newNumber<500)){
                            if(newNumber>=400){
                                newNumber-=400;
                                saida+="CD";
                            }else{
                                newNumber-=100;
                                saida+="C"; 
                            }
                        }else if((newNumber>=50)&&(newNumber<100)){
                            if(newNumber>=90){
                                newNumber-=90;
                                saida+="XC";
                            }else{
                                newNumber-=50;
                                saida+="L"; 
                            }
                        }else if((newNumber>=10)&&(newNumber<50)){
                            if(newNumber>=40){
                                newNumber-=40;
                                saida+="XL";
                            }else{
                                newNumber-=10;
                                saida+="X"; 
                            }
                        }else if((newNumber>=5)&&(newNumber<10)){
                            if(newNumber==9){
                                newNumber-=9;
                                saida+="IX";
                            }else{
                                newNumber-=5;
                                saida+="V";  
                            }
                        }else{
                            if(newNumber==4){
                                newNumber-=4;
                                saida+="IV";
                            }else{
                                newNumber-=1;
                                saida+="I";  
                            }
                        }
                    }
                    saida+="\n";
                }
                System.out.println(saida);
	}
}
