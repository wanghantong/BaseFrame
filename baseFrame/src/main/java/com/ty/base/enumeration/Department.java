package com.ty.base.enumeration;

public enum Department {
	finance(3000) {

		@Override
		public void pay() {
			System.out.println("we use the money for team dinner");

		}

		@Override
		public boolean finished() {
			return false;
		}

		@Override
		public int getOrder() {
			return this.ordinal();
		}

	},
	develop(4000) {
		@Override
		public void pay() {
			System.out.println("the money is used for buying device.");

		}

		@Override
		public boolean finished() {
			return false;
		}

		@Override
		public int getOrder() {
			return this.ordinal();
		}
	},
	support(4000) {
		@Override
		public void pay() {
			System.out.println("the money is used for customers.");

		}

		@Override
		public boolean finished() {
			return false;
		}

		@Override
		public int getOrder() {
			return this.ordinal();
		}
	},
	sales(8000) {
		@Override
		public void pay() {
			System.out.println("the money is used for item.");
		}

		@Override
		public boolean finished() {
			return true;
		}

		@Override
		public int getOrder() {
			return this.ordinal();
		}
	},
	hr(2000) {
		@Override
		public void pay() {
			System.out.println("the money is used for dinner.");

		}

		@Override
		public boolean finished() {
			return true;
		}

		@Override
		public int getOrder() {
			return this.ordinal();
		}
	};

	/**
	 * every object has different expenditure value
	 */
	private int expenditure;

	private Department(int expenditure) {
		this.expenditure = expenditure;
	}

	/**
	 * every object could use this method
	 * 
	 * @return expenditure
	 */
	public int getExpenditure() {
		return expenditure;
	}

	/**
	 * every object has different method implement
	 */
	public abstract void pay();

	public abstract boolean finished();

	public abstract int getOrder();

}
