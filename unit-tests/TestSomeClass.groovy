import org.junit.Assert
import org.junit.Test

import my.organization.logic.SomeClass

class TestSomeClass {

	@Test
	void testName() {
		final String NAME1 = "a name";
		final String NAME2 = "some other name";
		
		[ NAME1, NAME2 ].each { String name ->
			SomeClass c = new SomeClass(name);
			Assert.assertEquals(name, c.toString());
		}
	}
}
