
public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		smartTv.mudarCanal(12);
		
		System.out.println("Tv Ligada? " + smartTv.ligada);
		System.out.println("Canal atual? " + smartTv.canal);
		System.out.println("Volume atual? " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status: Tv Ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status: Tv Ligada? " + smartTv.ligada);

	}

}
