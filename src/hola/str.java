package hola;

public class str {
    public static void main(String[] args) {
        String text = "Intento hacer la prueba de certificación Java";
        System.out.println(text.indexOf("Intento")); 		// imprime 0
        System.out.println(text.indexOf("Intentaba")); 	// imprime -1
        System.out.println(text.indexOf("tento"));		// imprime 2
        System.out.println(text.indexOf("la")); 			// imprime 14
        System.out.println(text.lastIndexOf("a")); 		// imprime 44
        System.out.println(text.lastIndexOf("tenía")); 	//imprime -1
        System.out.println(text.startsWith("Intento"));	// true
        System.out.println(text.startsWith("tenía"));		// false
        System.out.println(text.endsWith("Java")); 		// true
        System.out.println(text.endsWith("Oracle")); 		// false

    }
}
