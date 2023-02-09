/* @autor 
 * 
*/

public class Comentarios {
    public static void main(String[] args) {
        System.out.println("Testando Documentação e comentários");
        //Em uma linha
        /*Em várias
         * linnhas
         */

         /** 
         * Estas duas estrelinhas acima
        * é para identificar que você
        * pretende elaborar um comentário
        * a nível de documentação.
        * Que incrível !!!
        // No terminal execute o comando abaixo
        javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
        */
        
    }
    
}
