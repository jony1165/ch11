package ch11;
interface Data
{
	public void showData();
}
interface Test
{
	public void showScore();
	public double calcu();
}
class CStu implements Data,Test
{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	public CStu(String s1,String s2,int m,int f,int c) {
		this.id=s1;
		this.name=s2;
		this.mid=m;
		this.finl=f;
		this.common=c;
	}
	public void showData() {
		System.out.println("�Ǹ�:"+id);
		System.out.println("�m�W:"+name);
	}
	public void showScore() {
		System.out.println("����:"+mid);
		System.out.println("����:"+finl);
		System.out.println("����:"+common);
		System.out.println("�Ǵ�:"+calcu());
	}
	public double calcu() {
		return (mid*0.3+finl*0.3+common*0.4);
	}
	public void show(){
		showData();
		showScore();
	}
}
public class class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("940001","Fiona",92,90,85);
		stu.show();
	}

}
