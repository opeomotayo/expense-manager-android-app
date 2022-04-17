package opeomotayo.com.expensemanager.view;

import java.util.List;

import opeomotayo.com.expensemanager.model.Expense;

public interface TodaysExpenseView {
  void displayTotalExpense(Long totalExpense);
  void displayTodaysExpenses(List<Expense> expenses);
}
