package KiemTra2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SinhVienDAO {
    private static final String STUDEN_FILE_NAME = "sinhvien.txt";

    public void write(List<SinhVien> sinhViens) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(STUDEN_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sinhViens);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<SinhVien> read(){
        List<SinhVien> sinhViens = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(STUDEN_FILE_NAME));
            ois = new ObjectInputStream(fis);
            sinhViens = (List<SinhVien>) ois.readObject();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            closeStream(fis);
            closeStream(ois);
        }
        return sinhViens;
    }
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


