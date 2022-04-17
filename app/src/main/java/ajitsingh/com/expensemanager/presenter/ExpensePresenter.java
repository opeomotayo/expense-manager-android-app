package opeomotayo.com.expensemanager.presenter;

import opeomotayo.com.expensemanager.database.ExpenseDatabaseHelper;
import opeomotayo.com.expensemanager.model.Expense;
import opeomotayo.com.expensemanager.view.ExpenseView;

import static opeomotayo.com.expensemanager.utils.DateUtil.getCurrentDate;

public class ExpensePresenter {

  private ExpenseDatabaseHelper database;
  private ExpenseView view;

  public ExpensePresenter(ExpenseDatabaseHelper expenseDatabaseHelper, ExpenseView view) {
    this.database = expenseDatabaseHelper;
    this.view = view;
  }

  public boolean addExpense() {
    String amount = view.getAmount();

    if(amount.isEmpty()) {
      view.displayError();
      return false;
    }

    Expense expense = new Expense(Long.valueOf(amount), view.getType(), getCurrentDate());
    database.addExpense(expense);
    return true;
  }

  public void setExpenseTypes() {
    view.renderExpenseTypes(database.getExpenseTypes());
  }
}
