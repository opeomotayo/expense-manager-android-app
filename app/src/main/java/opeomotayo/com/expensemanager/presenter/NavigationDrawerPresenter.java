package opeomotayo.com.expensemanager.presenter;

import opeomotayo.com.expensemanager.activity.CurrentMonthExpenseFragment;
import opeomotayo.com.expensemanager.activity.CurrentWeekExpenseFragment;
import opeomotayo.com.expensemanager.view.NavigationDrawerItemView;

public class NavigationDrawerPresenter {

  public static final String THIS_WEEK = "This Week";
  public static final String THIS_MONTH = "This Month";
  public static final String HOME = "Home";
  private NavigationDrawerItemView view;

  public NavigationDrawerPresenter(NavigationDrawerItemView view) {
    this.view = view;
  }

  public void onItemSelected(String drawerItem) {
    switch (drawerItem){
      case THIS_WEEK:
        view.render(new CurrentWeekExpenseFragment());
        break;
      case THIS_MONTH:
        view.render(new CurrentMonthExpenseFragment());
        break;
      case HOME:
        view.goToHome();
        break;
    }
  }
}
