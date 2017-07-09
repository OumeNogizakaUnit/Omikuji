import static org.junit.Assert.*;
import org.junit.Test;

public class KujiTest{

  @Test
  public void testKuji() {
    Kuji k = new Kuji();
    k.type = 1;
    assertEquals(1, k.type);
  }
}
