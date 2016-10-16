
public class AccountDatabaseServiceMySqlImpl_Stub implements AccountDatabaseService{
	public AccountDatabaseServiceImpl() {
	}

	public void insert(AccountPO po) {
		System.out.println("insert succeed!");
	}

	public void delete(AccountPO po) {
		System.out.println("delete succeed!");
	}

	public void update(AccountPO po) {
		System.out.println("update succeed!");
	}

	public AccountPO find(String memberName) {
		System.out.println("find succeed!");
		AccountPO po = new AccountPO();
		return po;
	}

	public AccountPO find(String id) {
		System.out.println("find succeed!");
		AccountPO po = new AccountPO();
		return po;
	}
}
