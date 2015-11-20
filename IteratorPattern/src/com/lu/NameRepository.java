package com.lu;

public class NameRepository implements Container {
	String[] names = { "Robert", "John", "Julie", "Lora" };

	private class NameIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;

		}

	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
}
