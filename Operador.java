package strategy2;

public class Operador implements StrategyOperation{
	
	
	
	@Override
	public int operate(int a , int b) {
		
		Calculator calc= new Calculator();
		calc.register("+", new Suma());
		calc.register("-", new Resta());
		calc.register("*", new Multiplicacion());
		calc.register("/", new MCD());
		
		int sup = calc.execute ("-",calc.execute("*", 2,a ),b);
		System.out.println(sup);
		int infe = calc.execute("+", 3, a);
		System.out.println(infe);
		return  calc.execute ("/",sup,infe);

	}

}
