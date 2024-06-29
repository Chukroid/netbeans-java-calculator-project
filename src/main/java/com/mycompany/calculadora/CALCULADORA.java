/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class CALCULADORA {
    
    public static String buscarValor_enHex(int num){ // creamos una funcion que buscara que valor tiene un decimal en hexadecimal y regresa el resultado en tipo string tomando como parametro el decimal de tipo int
	 if(num==1){	//checar si el numero es igual a 1
            return "1"; // regresa 1 porque 1 vale 1 en hexadecimal pero en tipo string
        }else if(num==2){	//checar si el numero es igual a 2
            return "2"; // regresa 2 porque 2 vale 2 en hexadecimal pero en tipo string
        }else if(num==3){	//checar si el numero es igual a 3
            return "3"; // regresa 3 porque 3 vale 3 en hexadecimal pero en tipo string
            }else if(num==4){	//checar si el numero es igual a 4
                    return "4"; // regresa 4 porque 4 vale 4 en hexadecimal pero en tipo string
            }else if(num==5){	//checar si el numero es igual a 5
                    return "5"; // regresa 5 porque 5 vale 5 en hexadecimal pero en tipo string
            }else if(num==6){	//checar si el numero es igual a 6
                    return "6"; // regresa 6 porque 6 vale 6 en hexadecimal pero en tipo string
            }else if(num==7){	//checar si el numero es igual a 7
                    return "7"; // regresa 7 porque 7 vale 7 en hexadecimal pero en tipo string
            }else if(num==8){	//checar si el numero es igual a 8
                    return "8"; // regresa 8 porque 8 vale 8 en hexadecimal pero en tipo string
            }else if(num==9){	//checar si el numero es igual a 9
                    return "9"; // regresa 9 porque 9 vale 9 en hexadecimal pero en tipo string
            }else if(num==10){	//checar si el numero es igual a 10
                    return "a"; // regresa a porque 10 vale a en hexadecimal
            }else if(num==11){	//checar si el numero es igual a 11
                    return "b"; // regresa b porque 11 vale b en hexadecimal
            }else if(num==12){	//checar si el numero es igual a 12
                    return "c"; // regresa c porque 12 vale c en hexadecimal
            }else if(num==13){	//checar si el numero es igual a 13
                    return "d"; // regresa d porque 13 vale d en hexadecimal
            }else if(num==14){	//checar si el numero es igual a 14
                    return "e"; // regresa e porque 14 vale e en hexadecimal
            }else if(num==15){	//checar si el numero es igual a 15
                    return "f"; // regresa f porque 15 vale f en hexadecimal
            }else{ //checa si no cumple con alguna condicion de arriba
                    return "0"; //regresa 0 pero en tipo string
	}
    }   
    
    public static String decimal_a_binario(int decimal){ // crear una funcion para convetir decimal a binario con un parametro 'decimal' que es lo que vamos a convertir
	String binario = "";  // declara el variable para el resultado binario
	
	if(decimal <= 0 ){ // checa si el decimal es menor o igual a 0
		binario = "0"; // si si, cambiar el valor de binario a 0
	} else { // si es mayor a 0 entonces
		while(decimal>0) // crear un siglo que se repite siempre y cuando el valor de decimal es mayor que 0
		{
			if((decimal%2) == 0){ // checar si el residuo de dividir decimal entre 2 es igual a 0
				binario = "0"+binario; // juntamos/concatenar el numero 0 con el variable binario
			}else{	// checar si el residuo de dividir decimal entre 2 es mayor que 0
				binario = "1"+binario;	// juntamos/concatenar el numero 1 con el variable binario
			}
			decimal = decimal/2;	// dividimos decimal entre 2
		}
	}
	return binario; //regresamos el valor obtenido al final de todo
    }
    
    public static String decimal_a_hexadecimal(int decimal){ // crear una funcion para convetir decimal a hexadecimal con un parametro 'decimal' que es lo que vamos a convertir
	String hex = null,valorEnHex; // declara el variable para el resultado hex y el valor del residuo de decimal entre 16 en hexadecimal
	
	if(decimal <= 0 ){ // checa si el decimal es menor o igual a 0
		hex = "0"; // si si, cambiar el valor de hex a 0
	} else { // si es mayor a 0 entonces
		while(decimal>0) // crear un siglo que se repite siempre y cuando el valor de decimal es mayor que 0
		{
			valorEnHex = buscarValor_enHex(decimal%16);	//consigue lo que regresa al ejecuta la funcion 'buscarValor_enHex' con el parametro que dice que consigamos el residuo de decimal
			hex = valorEnHex+hex; // juntamos/concatenar el valorEnHex con el variable hex
			decimal = decimal/16;	// dividimos decimal entre 16
		}
	}
	return hex; //regresamos el valor obtenido al final de todo
    }
    
    public static String decimal_a_octal(int decimal){ // crear una funcion para convetir decimal a octal con un parametro 'decimal' que es lo que vamos a convertir
	String octal = null,residuo; // declara el variable para el resultado octal y el residuo de decimal entre 8
	
	if(decimal <= 0 ){ // checa si el decimal es menor o igual a 0
		octal = "0"; // si si, cambiar el valor de octal a 0
	} else { // si es mayor a 0 entonces
		while(decimal>0) // crear un siglo que se repite siempre y cuando el valor de decimal es mayor que 0
		{
			residuo=Integer.toString(decimal%8);	// convertimos el residuo a string
			octal = residuo+octal; // juntamos/concatenar el residuo de dividir decimal entre 8 con el variable octal
			decimal = decimal/8;	// dividimos decimal entre 16
		}
	}
	return octal; //regresamos el valor obtenido al final de todo
    }
    
    public static int binario_a_decimal(String binario){ // crear una funcion para convetir binario a decimal con un parametro 'binario' que es lo que vamos a convertir
	int decimal = 0,multplicacion = 0;	// declara el variable para el resultado decimal y la longitud del binario
	int longitudDeBinario = binario.length();	//declara la longitud del binario
	char caracteractual;
	for(int i = (longitudDeBinario-1);i>= 0;i--){	// repetir las series de instrucciones abajo la cantidad de veces que la longitud es
		caracteractual = binario.charAt(i);
		if(caracteractual == '1' || caracteractual == '0'){	// checar si el caracter de la posicion 'i' no es igual a 1 ni 0
			if(caracteractual=='1'){
				decimal += pow(2,multplicacion); // sumamos al variable decimal la potencia de 2 al 'multplicacion'
			}
			multplicacion += 1; // sumamos 1 al variable multplicacion
		}
	}
	return decimal;	// regresa el valor obtenido al final de todo
    }
    
    public static int octal_a_decimal(String octal){ // crear una funcion para convetir octal a decimal con un parametro 'octal' que es lo que vamos a convertir
	int num = 0,octalNum,multplicacion; // declara variable para el resultado y octal en tipo entero
	int longituddeoctal = octal.length();	 //sacamos la longitud de octal de tipo string
	char caracteractual; // declara la letra que esta en posicion del variable i del for loop
	
	octalNum = Integer.parseInt(octal);
	multplicacion = 0;
	
	if(octalNum <= 0){ // si la octalNum es menor o igual a 0
		num = 0; // asignamos 0 al valor de num
	}else{
		for(int i = (longituddeoctal-1);i>= 0;i--){	// repetir las series de instrucciones abajo la cantidad de veces que la longitud es
			caracteractual = octal.charAt(i);
			if(caracteractual == '0' || caracteractual == '1' || caracteractual == '2' || caracteractual == '3' || caracteractual == '4' || caracteractual == '5' || caracteractual == '6' || caracteractual == '7' || caracteractual == '8' || caracteractual == '9'){	// checar si el caracter de la posicion 'i'  es igual a 0,1,2,3,4,5,6,7,8,9
				if(caracteractual=='0'){
					num += (0 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 0
				}else if(caracteractual=='1'){
					num += (1 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 1
				}else if(caracteractual=='2'){
					num += (2 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 2
				}else if(caracteractual=='3'){
					num += (3 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 3
				}else if(caracteractual=='4'){
					num += (4 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 4
				}else if(caracteractual=='5'){
					num += (5 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 5
				}else if(caracteractual=='6'){
					num += (6 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 6
				}else if(caracteractual=='7'){
					num += (7 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 7
				}else if(caracteractual=='8'){
					num += (8 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 8
				}else if(caracteractual=='9'){
					num += (9 * Math.pow(8,multplicacion)); // sumamos al variable decimal la potencia de 8 al 'multplicacion' multiplicado por 9
				}
				multplicacion += 1; // sumamos 1 al variable multplicacion
			}
		}
	}
	
	return num; // regresamos el valor obtenido al final de todo
    }
    
    public static int hexadecimal_a_decimal(String hex){ // crear una funcion para convetir hexadecimal a decimal con un parametro 'hex' que es lo que vamos a convertir
	int num = 0,multplicacion; // declara variable para el resultado y la multiplicacion
	int longituddehex = hex.length();	 //sacamos la longitud de hexadecimal de tipo string
	char caracteractual; // declara la letra que esta en posicion del variable i del for loop
	
	multplicacion = 0;
	
	for(int i = (longituddehex-1);i>= 0;i--){	// repetir las series de instrucciones abajo la cantidad de veces que la longitud es
		caracteractual = hex.charAt(i);
		Character.toLowerCase(caracteractual);
		if(caracteractual == '0' || caracteractual == '1' || caracteractual == '2' || caracteractual == '3' || caracteractual == '4' || caracteractual == '5' || caracteractual == '6' || caracteractual == '7' || caracteractual == '8' || caracteractual == '9' || caracteractual == 'a' || caracteractual == 'b' || caracteractual == 'c' || caracteractual == 'd' || caracteractual == 'e' || caracteractual == 'f'){	// checar si el caracter de la posicion 'i'  es igual a 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
			if(caracteractual=='0'){
				num += (0 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 0
			}else if(caracteractual=='1'){
				num += (1 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 1
			}else if(caracteractual=='2'){
				num += (2 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 2
			}else if(caracteractual=='3'){
				num += (3 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 3
			}else if(caracteractual=='4'){
				num += (4 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 4
			}else if(caracteractual=='5'){
				num += (5 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 5
			}else if(caracteractual=='6'){
				num += (6 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 6
			}else if(caracteractual=='7'){
				num += (7 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 7
			}else if(caracteractual=='8'){
				num += (8 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 8
			}else if(caracteractual=='9'){
				num += (9 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 9
			}else if(caracteractual=='a'){
				num += (10 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 10
			}else if(caracteractual=='b'){
				num += (11 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 11
			}else if(caracteractual=='c'){
				num += (12 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 12
			}else if(caracteractual=='d'){
				num += (13 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 13
			}else if(caracteractual=='e'){
				num += (14 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 14
			}else if(caracteractual=='f'){
				num += (15 * Math.pow(16,multplicacion)); // sumamos al variable decimal la potencia de 16 al 'multplicacion' multiplicado por 15
			}
			multplicacion += 1; // sumamos 1 al variable multplicacion
		}
	}
	return num; // regresamos el valor obtenido al final de todo
}

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean continuar = true; //declarando un variable que indica que ciclonse seguira repitiendo 
        while(continuar == true){//empiza un ciclo que se repite solo si la variable es correcta 
                boolean opcioncorrecta = true; //se declara la variable para indicar que la opcion elegida sea valida 
                char opcion; // declara los variables de opciones de tipo caracter
                int num = 0,opcion2,opcioncontinuar; // declara variables para decimales, binario y octal de tipo enteros
                String numeroHex = null,binario = null,numeroOctal = null; // declara variable para hexadecimales de tipo cadena de caracters

                System.out.printf("\n\n BIENVENIDO  \n\n");	//imprimir un mensaje de bienvenida al usuario
                System.out.printf("--------------------------------------------------------------------------------\n\n");//hace un seperador del mensaje de bienvenida de las opciones de conversiones
                System.out.printf("\t\t\t\t OPCIONES DE CONVERSIONES \n\n"); // el titulo para las opciones de conversiones
                System.out.printf("\t|		Opcion '1': SISTEMA NUMERICO		 		|\n\n");
                System.out.printf("\t|		Opcion '2': CALCULADORA CIENTIFICA  		|\n\n");
                System.out.printf("\t\t\t\t------------------------\n\n");
                System.out.printf("Elegir una opcion: ");
                opcion2 = sn.nextInt();
                if(opcion2 == 1){
                        //Imprimir todas las opciones de conversiones
                        System.out.printf("\t|		Opcion 'A': Decimal a Binario			|\n\n");
                        System.out.printf("\t|		Opcion 'B': Decimal a Hexadecimal		|\n\n");
                        System.out.printf("\t|		Opcion 'C': Decimal a Octal			    |\n\n");
                        System.out.printf("\t|		Opcion 'D': Binario a Decimal			|\n\n"); 
                        System.out.printf("\t|		Opcion 'E': Binario a Hexadecimal		|\n\n");
                        System.out.printf("\t|		Opcion 'F': Binario a Octal			    |\n\n");
                        System.out.printf("\t|		Opcion 'G': Octal a Decimal			    |\n\n");
                        System.out.printf("\t|		Opcion 'H': Octal a Binario			    |\n\n");
                        System.out.printf("\t|		Opcion 'I': Octal a Hexadecimal			|\n\n");
                        System.out.printf("\t|		Opcion 'J': Hexadecimal a Decimal		|\n\n");
                        System.out.printf("\t|		Opcion 'K': Hexadecimal a Binario		|\n\n");
                        System.out.printf("\t|		Opcion 'L': Hexadecimal a Octal			|\n\n");
                }
                else if(opcion2 == 2){
                        System.out.printf("\t|		Opcion 'M': Suma			            |\n\n");
                        System.out.printf("\t|		Opcion 'N': Resta		            	|\n\n");
                        System.out.printf("\t|		Opcion 'O': Division		          	|\n\n");
                        System.out.printf("\t|		Opcion 'P': Multiplicacion		        |\n\n");
                        System.out.printf("\t|		Opcion 'Q': Raiz cuadrada		       	|\n\n");
                        System.out.printf("\t|		Opcion 'R': Potecia	                	|\n\n");
                        System.out.printf("\t|		Opcion 'S': Tangente		            |\n\n");
                        System.out.printf("\t|		Opcion 'T': Seno			            |\n\n");
                        System.out.printf("\t|		Opcion 'U': Coseno		                |\n\n");
                        System.out.printf("\t|		Opcion 'V': Logaritmo natural			|\n\n");
                        System.out.printf("\t|		Opcion 'W': Logaritmo de base 10 		|\n\n");
                        System.out.printf("\t|		Opcion 'x': euler   					|\n\n");

                        System.out.printf("--------------------------------------------------------------------------------\n\n\n");		//hace un seperador de las opciones y el proceso

                }else{
                        opcioncorrecta = false;
                        //borrar pantalla
                        }


                if (opcioncorrecta == true){
                        System.out.printf("\tElige la opcion que deseas realizar: ");		// pedir la opcion que quiere realizar al usuario
                        opcion = sn.next().charAt(0);
                        Character.toLowerCase(opcion);
                        if(opcion=='a' || opcion=='b' || opcion=='c'){	// si la opcion que elegio el usuario es de convertir un decimal
                                System.out.printf("\n\tIngresa el numero Decimal que deseas convertir: "); // pedir el numero decimal al usuario
                                num = sn.nextInt();	// esperaramos para que el usuario ingrese un decimal
                        }else if(opcion=='d' || opcion=='e' || opcion=='f'){ // sino, si la opcion que elegio es de convertir un binario
                                System.out.printf("\n\tIngresa el numero Binario que deseas convertir: "); // pedir el numero binario al usuario
                                binario = sn.next();	// esperaramos para que el usuario ingrese el numero binario
                        }else if(opcion=='g' || opcion=='h' || opcion=='i'){ // sino, si la opcion que elegio es de convertir un octal
                                System.out.printf("\n\tIngresa el numero Octal que deseas convertir: "); // pedir el numero octal al usuario
                                numeroOctal = sn.next();	// esperaramos para que el usuario ingrese el numero octal
                        }else if(opcion=='j' || opcion=='k' || opcion=='l'){ // sino, si la opcion que elegio es de convertir un hexadecimal
                                System.out.printf("\n\tIngresa el numero Hexadecimal que deseas convertir: "); // pedir el numero hexadecimal al usuario
                                numeroHex = sn.next();	// esperaramos para que el usuario ingrese el numero hexadecimal
                        }
                        System.out.printf("\n\n--------------------------------------------------------------------------------\n\n\n");		//hace un seperador de las opciones y el proceso


                        if(opcion=='a') // si la opcion fue A (decimal a binario)
                        {

                                binario = decimal_a_binario(num); // ejecutamos la funcion 'decimal_a_binario' para que nos regresa un valor en la cual asignaremos al variable 'binario'
                                System.out.printf("\t La conversion de %d a Binario es: %s\n\n",num,binario);

                        }else if(opcion=='b')
                        {
                                numeroHex = decimal_a_hexadecimal(num);	// ejecutamos la funcion 'decimal_a_hexadecimal' para que nos regresa un valor en la cual asignaremos al variable 'numeroHex'
                                System.out.printf("\t La conversion de %d a Hexadecimal es: %s\n\n",num,numeroHex); // imprimimos el resultado de la conversion

                        }else if(opcion=='c')
                        {

                                numeroOctal = decimal_a_octal(num);	// ejecutamos la funcion 'decimal_a_octal' para que nos regresa un valor en la cual asignaremos al variable 'numeroOctal'
                                System.out.printf("\t La conversion de %d a Octal es: %s\n\n",num,numeroOctal); // imprimimos el resultado de la conversion

                        }else if(opcion=='d')
                        {

                                num = binario_a_decimal(binario);	// ejecutamos la funcion 'binario_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                System.out.printf("\t La conversion de %s a Decimal es: %d\n\n",binario,num); // imprimimos el resultado de la conversion


                        }else if(opcion=='e')
                        {

                                num = binario_a_decimal(binario);	// ejecutamos la funcion 'binario_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                numeroHex = decimal_a_hexadecimal(num); // ejecutamos la funcion 'decimal_a_hexadecimal' para que nos regresa un valor en la cual asignaremos al variable 'numerohex'
                                System.out.printf("\t La conversion de %s a Hexadecimal es: %s\n\n",binario,numeroHex); // imprimimos el resultado de la conversion


                        }else if(opcion=='f')
                        {

                                num = binario_a_decimal(binario);	// ejecutamos la funcion 'binario_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                numeroOctal = decimal_a_octal(num); // ejecutamos la funcion 'decimal_a_octal' para que nos regresa un valor en la cual asignaremos al variable 'numerooctal'
                                System.out.printf("\t La conversion de %s a Octal es: %s\n\n",binario,numeroOctal); // imprimimos el resultado de la conversion


                        }else if(opcion=='g')
                        {

                                num = octal_a_decimal(numeroOctal);	// ejecutamos la funcion 'octal_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                System.out.printf("\t La conversion de %s a Decimal es: %d\n\n",numeroOctal,num); // imprimimos el resultado de la conversion


                        }else if(opcion=='h')
                        {

                                num = octal_a_decimal(numeroOctal);	// ejecutamos la funcion 'octal_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                binario = decimal_a_binario(num); // ejecutamos la funcion 'decimal_a_binario' para que nos regresa un valor en la cual asignaremos al variable 'binario'
                                System.out.printf("\t La conversion de %s a Binario es: %s\n\n",numeroOctal,binario); // imprimimos el resultado de la conversion


                        }else if(opcion=='i')
                        {

                                num = octal_a_decimal(numeroOctal);	// ejecutamos la funcion 'octal_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                numeroHex = decimal_a_hexadecimal(num); // ejecutamos la funcion 'decimal_a_hexadecimal' para que nos regresa un valor en la cual asignaremos al variable 'numerohex'
                                System.out.printf("\t La conversion de %s a Hexadecimal es: %s\n\n",numeroOctal,numeroHex); // imprimimos el resultado de la conversion


                        }else if(opcion=='j')
                        {

                                num = hexadecimal_a_decimal(numeroHex);	// ejecutamos la funcion 'hexadecimal_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                System.out.printf("\t La conversion de %s a Decimal es: %d\n\n",numeroHex,num); // imprimimos el resultado de la conversion


                        }else if(opcion=='k')
                        {

                                num = hexadecimal_a_decimal(numeroHex);	// ejecutamos la funcion 'hexadecimal_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                binario = decimal_a_binario(num); // ejecutamos la funcion 'decimal_a_binario' para que nos regresa un valor en la cual asignaremos al variable 'numerohex'
                                System.out.printf("\t La conversion de %s a Binario es: %s\n\n",numeroHex,binario); // imprimimos el resultado de la conversion


                        }else if(opcion=='l')
                        {

                                num = hexadecimal_a_decimal(numeroHex);	// ejecutamos la funcion 'hexadecimal_a_decimal' para que nos regresa un valor en la cual asignaremos al variable 'num'
                                numeroOctal = decimal_a_octal(num); // ejecutamos la funcion 'decimal_a_binario' para que nos regresa un valor en la cual asignaremos al variable 'numerohex'
                                System.out.printf("\t La conversion de %s a Octal es: %s\n\n",numeroHex,numeroOctal); // imprimimos el resultado de la conversion


                        }else if (opcion == 'm'){
                                int num2,num3,resultado;//declaramos variables 

                                System.out.printf("elige el primer numero: ");//pedir un numero al usuario 
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                System.out.printf("elige el segundo numero: ");//pedir un numero al usuario
                                num3 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=num2+num3;//se realiza la operacion
                                System.out.printf("tu resultado es %d",resultado);//imprime tu resultado 


                        }else if (opcion == 'n'){
                                int num2,num3,resultado;//declaramos variables 

                                System.out.printf("elige el primer numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                System.out.printf("elige el segundo numero: ");//pedir un numero al usuario
                                num3 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=num2-num3;//se realiza la operacion
                                System.out.printf("tu resultado es %d",resultado);

                        }else if (opcion == 'o'){
                                float num2,num3;//declaramos variables 
                                float resultado;//declaramos variables 

                                System.out.printf("elige el primer numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                System.out.printf("elige el segundo numero: ");//pedir un numero al usuario
                                num3 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=num2/num3;//se realiza la operacion
                                System.out.printf("tu resultado es %.2f",resultado);//imprime tu resultado

                        }else if (opcion == 'p'){
                                int num2,num3,resultado;//declaramos variables 

                                System.out.printf("elige el primer numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                System.out.printf("elige el segundo numero: ");//pedir un numero al usuario
                                num3 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=num2*num3;//se realiza la operacion
                                System.out.printf("tu resultado es %d",resultado);//imprime tu resultado

                        }else if (opcion == 'q'){ //declaramos variables
                            //declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige un numero: ");//pedir un numero al usuario
                                num = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=Math.sqrt(num);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }else if (opcion == 'r'){
                                int num2,num3;//declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige el primer numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                System.out.printf("elige el segundo numero: ");//pedir un numero al usuario
                                num3 = sn.nextInt();//esperar a que el usuario introdusca un numero

                                resultado=Math.pow(num2,num3);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }else if (opcion == 's'){
                                int num2;//declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige un numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=Math.tan(num2);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }else if (opcion == 't'){
                                int num2;//declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige un numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=Math.sin(num2);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }else if (opcion == 'u'){
                                int num2;//declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige un numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=Math.cos(num2);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }else if (opcion == 'v'){
                                int num2;//declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige un numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=Math.log(num2);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }else if (opcion == 'w'){
                                int num2;//declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige un numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=Math.log10(num2);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }else if (opcion == 'x'){
                                int num2;//declaramos variables 
                                double resultado;//declaramos variables 

                                System.out.printf("elige un numero: ");//pedir un numero al usuario
                                num2 = sn.nextInt();//esperar a que el usuario introdusca un numero
                                resultado=Math.exp(num2);//se realiza la operacion
                                System.out.printf("tu resultado es %.3f",resultado);//imprime tu resultado

                        }


                        else{
                                //limpia pantalla 
                        }


                        System.out.printf("\n \n para reiniciar escriba 1: ");//pedir un numero de opcion al usuario
                        opcioncontinuar = sn.nextInt();//esperar aque el usuario introdusca un numero 
                        if(opcioncontinuar!=1){//si la opcion es igual a 1
                                continuar=false;//termina el while loop
                        }else{//si no 
                            //limpiar pantalla y repetir el proceso 
                        }
                }		
        }

    }

    private static void tolower(char caracteractual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
