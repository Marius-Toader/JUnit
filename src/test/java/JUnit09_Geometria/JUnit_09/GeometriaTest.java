package JUnit09_Geometria.JUnit_09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {

	@Test
	public void testConstructor() {
		Geometria geometria = new Geometria(2);
		Geometria geometriaEsperada = new Geometria();
		geometriaEsperada.setId(2);
		geometriaEsperada.setNom("Circulo");
		assertEquals(geometria, geometriaEsperada);
	}
	
	@Test
	public void testAreacuadrado() {
		int resultado = Geometria.areacuadrado(2);
		int esperado = 4;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreacirculo() {
		double resultado = Geometria.areaCirculo(3);
		double esperado = 28.2744;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreatuadrado() {
		int resultado = Geometria.areatriangulo(5, 4);
		int esperado = 10;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testArearectangulo() {
		int resultado = Geometria.arearectangulo(2, 3);
		int esperado = 6;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreapentagono() {
		int resultado = Geometria.areapentagono(4, 2);
		int esperado = 4;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testArearombo() {
		int resultado = Geometria.arearombo(6, 3);
		int esperado = 9;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testArearomboide() {
		int resultado = Geometria.arearomboide(2, 3);
		int esperado = 6;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testAreatrapecio() {
		int resultado = Geometria.areatrapecio(2, 4, 2);
		int esperado = 6;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFigura1() {
		String resultado = Geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFigura2() {
		String resultado = Geometria.figura(2);
		String esperado = "Circulo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFigura3() {
		String resultado = Geometria.figura(3);
		String esperado = "Triangulo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFigura4() {
		String resultado = Geometria.figura(4);
		String esperado = "Rectangulo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFigura5() {
		String resultado = Geometria.figura(5);
		String esperado = "Pentagono";
		assertEquals(resultado, esperado);
	}

	@Test
	public void testFigura6() {
		String resultado = Geometria.figura(6);
		String esperado = "Rombo";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFigura7() {
		String resultado = Geometria.figura(7);
		String esperado = "Romboide";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testFigura8() {
		String resultado = Geometria.figura(8);
		String esperado = "Trapecio";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testGetId() {
		Geometria geometria = new Geometria(2);
		int id = geometria.getId();
		int esperado = 2;
		assertEquals(id, esperado);
	}
	
	@Test
	public void testSetId() {
		Geometria geometria = new Geometria(2);
		int id = 4;
		geometria.setId(id);
		assertEquals(geometria.getId(), id);
	}
	
	@Test
	public void testGetNom() {
		Geometria geometria = new Geometria(2);
		String nom = geometria.getNom();
		String esperado = "Circulo";
		assertEquals(nom, esperado);
	}
	
	@Test
	public void testSetNom() {
		Geometria geometria = new Geometria(2);
		String nom = "Rombo";
		geometria.setNom(nom);
		assertEquals(geometria.getNom(), nom);
	}
	
	@Test
	public void testSetArea() {
		Geometria geometria = new Geometria(1);
		int area = 4;
		geometria.setArea(area);
		assertEquals(geometria.getArea(), area);
	}
	
	@Test
	public void testGetArea() {
		Geometria geometria = new Geometria(1);
		int area = 9;
		geometria.setArea(area);
		assertEquals(geometria.getArea(), area);
	}
	
	@Test
	public void testToString() {
		Geometria geometria = new Geometria(1);
		geometria.setArea(9);
		String esperado = "Geometria [id=1, nom=cuadrado, area=9]";
		assertEquals(geometria.toString(), esperado);
	}
}