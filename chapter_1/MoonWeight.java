/*
	Self Test Question 1.9

	Given that the moon's gravity is 17% that of earth's,
	what is your effective weight on the moon?
*/
class MoonWeight {
	public static void main(String args[]) {
		double e_weight, m_weight;

		e_weight = 185;
		m_weight = e_weight * .17;

		System.out.println("If you weigh " + e_weight +
				" lbs on earth, your effective weight on the moon is "
				+ m_weight + " lbs.");
	}
}
