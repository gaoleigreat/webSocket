/**
 * @ClassName : MyThread
 * @Description : TODO
 * @Author : xiaodao
 * @Date : 2018/10/31  1:51
 * @Version : 1.0
 **/
public class MyThread implements Runnable{
    private int sum;
    private int new_sum;
    private boolean stopMe = true;
    public void stopMe() {
        stopMe = false;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run()  {
        // UrlDao urlDao=new UrlDao();
        //  sum=urlDao.selectCount();
        WebSocketServlet wbs=new WebSocketServlet();
        while(stopMe){
            // new_sum=urlDao.selectCount();
           // if(sum!=new_sum){
                System.out.println("change");
                sum=new_sum;
                wbs.onMessage(sum);
           // }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
