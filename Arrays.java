public class Arrays{
    public static void main(String[] args) {
        //declaracion del areglo
        int[] numeros;
        //iniciar el arreglo con valores
        numeros=new int[5];

        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;

        //imprimir los valores del array
        for(int j=0; j<numeros.length; j++){
            System.out.println("Los numeros son:"+j+numeros[j]);
        }
        

        //int suma=numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];

        //System.out.println("La suma del array: "+suma);
        int suma=0;
        for(int i=0; i<numeros.length; i++){
            suma+=numeros[i];
        }
            System.out.println("Suma del ciclo for es: "+suma);
}
}
