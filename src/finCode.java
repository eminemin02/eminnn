public class finCode {
    private static finCode code;
    public static finCode getCode(){
        if (code==null) code= new finCode();
        return code;
    }
    private finCode(){

    }
}
