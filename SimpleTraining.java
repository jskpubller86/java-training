import java.io.File;

public class SimpleTraining {
    void execute(){
        try{
            String dirPath = "directory";
            String fileName = "file";

            File directory = new File(dirPath);

            // 파일가 있는지 확인하고 디렉터리를 만든다.
            if(!directory.exists()){
                // 만약 파일경로가 두개일 경우  mkdir()은 실행이 안된다.
                // 파일 경로가 하나이고 디렉터리일 경우 다음 명령을 실행된다.

                directory.mkdir();
                System.out.println(dirPath + "생성 완료");
            } else {
                System.out.println(dirPath + " 있음");
            }

            // 파일 생성
            File file = new File(dirPath+"/"+fileName);
            file.createNewFile();
            System.out.println(fileName + "생성 완료");

            // 파일 존재 유무 확인
            System.out.printf("파일 존재 유무 : %b %n", file.exists());

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
