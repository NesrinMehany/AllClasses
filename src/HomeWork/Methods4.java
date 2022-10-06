package HomeWork;

public class Methods4 {

    String hello(String con) {
        String country= con.toUpperCase();
        String lang;
        switch (country) {

            case "USA":
                lang = "Hello";
                break;

            case "INDIA":
                lang = "नमस्ते";
                break;

            case "SPAIN":
                lang = "Hola";
                break;

            case "UAE":
                lang = "مرحبا";
                break;
            case "NETHERLANDS":
                lang = "Hallo";

                break;
            default:
                lang = "lANGUAGE UNKNON";


        }
        return lang;
    }

    String hellos(String count) {
        String country= count.toUpperCase();
        String lang = switch (country) {
            case "USA" -> "Hello";
            case "INDIA" -> "नमस्ते";
            case "SPAIN" -> "Hola";
            case "UAE" -> "مرحبا";
            case "NETHERLANDS" -> "Hallo";
            default -> "lANGUAGE UNKNON";
        };
        return lang;
    }

    public static void main(String[] args) {


        Methods4 m = new Methods4();
        String language = m.hello("Netherlands");
        System.out.println("I can say " + language);
    }
}