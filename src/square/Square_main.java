package square;

public class Square_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*���p�f�[�^�@���L�̃f�[�^
�@�@�@�@�@�@�@���_�l�@�X���@5.107143 �ؕЁ@1.007143
		 */
double x[] = {  0.0, 0.2, 0.4, 0.6, 0.8, 1.0,1.2 };

double y[] = { 1.0, 1.9, 3.2, 4.3, 4.8, 6.1,7.2 };

double theta[] = new double[2];
Square_lib slib = new Square_lib(x,y);


for(int i = 0; i < 100; i++){
            theta = slib.getDx();
            System.out.println(i+" : theta[0] = "+theta[0]);
            System.out.println(i+" : theta[1] = "+theta[1]);
            System.out.println(i+" : Objective function = "+slib.getRx());
        }
 }

}
