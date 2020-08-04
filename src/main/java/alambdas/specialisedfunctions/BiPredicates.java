package alambdas.specialisedfunctions;

import java.util.function.BiPredicate;

import alambdas.domain.Employee;
import alambdas.domain.EncryptedTrade;
import alambdas.domain.Manager;
import alambdas.domain.Trade;

/**
 * Class that demonstrates Predicate function usage
 * 
 * @author mkonda
 *
 */
public class BiPredicates {

	BiPredicate<Employee, Manager> empManagerPredicate = (emp, manager) -> emp
			.getManager().equals(manager);

	BiPredicate<Employee, Manager> managerHasAssistantPredicate = (emp, manager) -> manager
			.getPersonalAssistant().equals(emp) ? true : false;

	BiPredicate<Trade, EncryptedTrade> tradeCopier = (trade1, trade2) -> {
		boolean copySuccess = false;
		if (!trade1.isOpen()) {
			copySuccess = trade1.copy(trade2);
		}
		return copySuccess;
	};

	BiPredicate<Trade, Trade> tradeComparer = (t1, t2) -> t1.getId() == t1
			.getId();

	BiPredicate<String, String> stringComparer = (s1, s2) -> s1
			.equalsIgnoreCase(s2);

	/**
	 * Using AND function
	 */
	public void usingAnd() {
		// BiPredicate<Trade, String> statusPredicate = (trade, status) ->
		// trade.getStatus() == status;
		// BiPredicate<Trade, String> quantityPredicate = (trade, value) ->
		// trade.getInstrument().equals(value);
		//
		// BiPredicate<Trade, String> isOpenAndGoogleTrade =
		// statusPredicate.and(quantityPredicate);

		// Composed function using and method
		BiPredicate<Employee, Manager> isPersonalAssistant = empManagerPredicate
				.and(managerHasAssistantPredicate);
	}

	/**
	 * Using OR function
	 */
	public void usingOr() {
		// Using OR method
		BiPredicate<Employee, Manager> isPersonalAssistant = empManagerPredicate
				.or(managerHasAssistantPredicate);

	}

	/**
	 * Using negate function
	 */
	public void usingNegate() {
		// Negating the existing predicate
		BiPredicate<Employee, Manager> notAManagerPredicate = empManagerPredicate
				.negate();
	}
}
