package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        return this.arregloEnteros.clone();
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return this.arregloCadenas.clone();
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        int cantidad = this.arregloCadenas.length;
        return cantidad;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
        int [] Arreglo = new int[this.arregloEnteros.length+1]; // Se crea un arreglo pero con mayor longitud que el que se recibe
    	
    	for (int pos = 0; pos<this.arregloEnteros.length;pos++) 
    	{
    		Arreglo[pos]=this.arregloEnteros[pos];
    	}
    	
        Arreglo[Arreglo.length-1]=entero;
        this.arregloEnteros = Arreglo;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String [] Arreglo = new String[this.arregloCadenas.length+1]; // Se crea un arreglo pero con mayor longitud que el que se recibe
    	
    	for (int pos = 0; pos<this.arregloCadenas.length;pos++) 
    	{
    		Arreglo[pos]=this.arregloCadenas[pos];
    	}
    	
        Arreglo[Arreglo.length-1]=cadena;
        this.arregloCadenas = Arreglo;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int apariciones = contarApariciones(valor);
    	
    	int []  Arr = new int[this.arregloEnteros.length-apariciones];
    	
    	int apr=0;
    			
    	for (int i=0 ; i < this.arregloEnteros.length ; i++) {
    		if (apr > 0) {
    			if (arregloEnteros[i]==valor) {
        			apr+=1;
        		}
    			else {
    				Arr[i-apr]=this.arregloEnteros[i];
    			}
    		}
    		else {
    			if (arregloEnteros[i]==valor) {
        			apr+=1;
        		}
    			else {
    				Arr[i]=this.arregloEnteros[i];
    			}
    		}
    	}
    	
    	this.arregloEnteros=Arr;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
int apariciones = contarApariciones(cadena);
    	
    	String []  Arr = new String[this.arregloCadenas.length-apariciones];
    	
    	int apr=0;
    			
    	for (int i=0 ; i < this.arregloCadenas.length ; i++) {
    		if (apr > 0) {
    			if (arregloCadenas[i]==cadena) {
        			apr+=1;
        		}
    			else {
    				Arr[i-apr]=this.arregloCadenas[i];
    			}
    		}
    		else {
    			if (arregloCadenas[i]==cadena) {
        			apr+=1;
        		}
    			else {
    				Arr[i]=this.arregloCadenas[i];
    			}
    		}
    	}
    	
    	this.arregloCadenas=Arr;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int [] Arr = new int [this.arregloEnteros.length+1];
    	
    	if (posicion < 0) {
            posicion = 0;
        }
        
    	else if (posicion > this.arregloEnteros.length) {
            posicion = this.arregloEnteros.length;
        }

        for (int i = 0; i < posicion; i++) {
            Arr[i] = this.arregloEnteros[i];
        }

        Arr[posicion] = entero;


        for (int i = posicion; i < this.arregloEnteros.length; i++) {
            Arr[i + 1] = this.arregloEnteros[i];
        }

        this.arregloEnteros = Arr;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
        if (posicion>=0 && posicion < this.arregloEnteros.length) {
	    	int [] Arr = new int [this.arregloEnteros.length-1];
	    	
	    	boolean pos = false;
	    	
	    	for (int p = 0; p<this.arregloEnteros.length ; p++) {
	    		if (pos == true){
	    			Arr[p-1]=this.arregloEnteros[p];
	    		}
	    		else {
	    			if (p==posicion) {
	    				pos=true;
	    			}
	    			else {
	    				Arr[p]=this.arregloEnteros[p];
	    			}
	    		}
	    	}
	    	
	    	this.arregloEnteros=Arr;
    }
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int [] Arr = new int [valores.length];
    	for (int i = 0; i < valores.length ; i++) {
    		Arr[i]=(int) valores[i];
    	}
    	this.arregloEnteros=Arr;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String [] Arr = new String [objetos.length];
    	
    	for (int i = 0; i < objetos.length ; i++) {
    		Arr[i]=objetos[i].toString();
    	}
    	this.arregloCadenas=Arr;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
        for(int i=0;i<this.arregloEnteros.length;i++) {
    		if(this.arregloEnteros[i]<0) {
    			this.arregloEnteros[i]=this.arregloEnteros[i]*-1;
    		}
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
        int [] Arr = new int [this.arregloEnteros.length];
    	for(int i :this.arregloEnteros) {
    		for (int j = 0; j < this.arregloEnteros.length ; j++) {
    			if (i > this.arregloEnteros[j]) {
    				i=Arr[j];
    				
    			}
    		}
    	}
    	
    	this.arregloEnteros=Arr;
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	String [] Arr = new String [this.arregloCadenas.length];
    	for(String i :this.arregloCadenas) {
    		int pos = 0;
    		for (int j = 0; j < this.arregloCadenas.length ; j++) {
    			if (i.compareTo(this.arregloCadenas[j])<=0) {
    				pos=j;
    				
    			}
    		Arr[pos]=i;
    		}
    	}
    	
    	this.arregloCadenas=Arr;
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int contador = 0;
    	for (int elem:this.arregloEnteros) {
    		if (elem==valor) {
    			contador++;
    		}
    	}
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        int contador = 0;
    	for (String elem:this.arregloCadenas) {
    		if (elem.equalsIgnoreCase(cadena)) {
    			contador++;
    		}
    	}
        return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
        if (this.arregloEnteros.length==0) {
        	int[] Arr = {};
        	return Arr;
        }
        
        else {
        	HashMap<Integer,Integer> Find = new HashMap<Integer,Integer>();
        	int contador=0;
        	for(int i=0;i<this.arregloEnteros.length;i++) {
        		if (this.arregloEnteros[i]==valor) {
        			Find.put(i,i);
        			contador++;
        		}
        	}
        	int [] Repetido = new int[contador];
        	int posicion=0;
        	for(int i:Find.values()) {
        		Repetido[posicion]=i;
        		posicion++;
        	}
        	
        	return Repetido;
        }
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
        if (this.arregloEnteros.length!=0) {
        	
        	int minimo=this.arregloEnteros[0];
        	int maximo=0;
        	for(int valor:this.arregloEnteros) {
        		
        		if (valor>maximo) {
        			maximo=valor;
        		}
        		
        		if (valor<minimo) {
        			minimo=valor;
        		}
        		
        	}
        
        	int [] Arr = {minimo,maximo};
        	
        	return Arr;
        	
        }
        
        return new int[0];
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        HashMap<Integer,Integer> Histograma = new HashMap<Integer,Integer>();
    	for (int i: this.arregloEnteros) {
    		if (Histograma.containsKey(i)){
    			Histograma.put(i, Histograma.get(i)+1);
    		}
    		else {
    			Histograma.put(i, 1);
    		}
    	}
    	return Histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
        int repetidos = 0;
        HashMap<Integer,Integer> Histograma = calcularHistograma();
    		    	
    	for (int j: Histograma.values()) {
    		
    		if (j>1) {repetidos++;}
    		
    	}
    	return repetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if (otroArreglo.length != this.arregloEnteros.length) {
    		return false;
    	}
    	
    	else {
    		for (int i = 0; i < this.arregloEnteros.length; i++) {
    	        if (otroArreglo[i] != this.arregloEnteros[i]) {
    	            return false; 
    	        }
    	    }
    	}
    	
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (otroArreglo.length != this.arregloEnteros.length) {
    		return false;
    	}
    	
    	if (otroArreglo.length ==0 && this.arregloEnteros.length==0) {
    		return true;
    	}
        boolean var =false;
        
        HashMap <Integer,Integer> Histo1= calcularHistograma();
        for (int i:otroArreglo) {
        	if (Histo1.containsKey(i)) {
        		var=true;
        	}
        	
        }
        
        return var;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
        int [] Arr = new int[cantidad];
        int rango = maximo - minimo + 1;
    	for(int i = 0; i < Arr.length ; i++) {
    		Arr[i]=(int)(Math.random()*rango) + minimo;
    	}
    	this.arregloEnteros=Arr;
    }

    }


