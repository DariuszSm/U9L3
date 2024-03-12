public class Tools {
    static String infoToString(String label, Object var){
        StringBuilder sb = new StringBuilder();

        sb.append(label);
        sb.append(var);
        sb.append("\n");

        return sb.toString();
    }
}
