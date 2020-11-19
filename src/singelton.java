public class singelton {
    public volatile static singelton unique;

    private singelton(){};
    public static singelton getInstance(){
        if(unique==null){
            synchronized (singelton.class){
                if(unique==null){
                    unique = new singelton();
                }
            }
        }
        return unique;
    }
}
