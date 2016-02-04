import com.dx.orm.idao.IDao;

/**
 * Created by diaomingkai on 2016-2-3.
 */
public class Main {


    public static void main(String[] args) {
        try {
            IDao iDao = (IDao)Class.forName("com.dx.orm.sqlserver.Db").newInstance();
            System.out.print(iDao.insert());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
