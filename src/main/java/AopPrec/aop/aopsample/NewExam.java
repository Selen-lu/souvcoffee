package AopPrec.aop.aopsample;

public class NewExam implements Exam {
    public NewExam() {}

    int kor;
    int eng;
    int math;
    int com;


    public NewExam(int kor, int eng, int math, int com) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }




    @Override
    public String toString() {
        return "Exam{" +
                "kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", com=" + com +
                '}';
    }


    @Override
    public int total() {

        //시작하는 시점 시간 구하기
        long start = System.currentTimeMillis();

        int result = kor+eng+math+com;

        //끝나는 시간은 시작과 시간이 같을테니 예외처리로 조금 느리게 해봄
        try{
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        String message = "[ total , 자바코드에 직접 작성 ]main에서 값이 온 후 걸린시간을 계산 이후 반환 "+(end - start)+" ms";
        System.out.println(message);
        return result;
    }

    @Override
    public float avg() {

/*        //시작하는 시점 시간 구하기
        long start = System.currentTimeMillis();*/

       // float result = kor+eng+math+com /4.0f;
        float result = total() /4.0f;

/*


        //끝나는 시간은 시작과 시간이 같을테니 예외처리로 조금 느리게 해봄
        try{
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        String message = "[ avg ] main에서 값이 온 후 걸린시간을 계산 이후 반환 "+(end - start)+" ms";
        System.out.println(message);

*/

        return result;
    }


}
