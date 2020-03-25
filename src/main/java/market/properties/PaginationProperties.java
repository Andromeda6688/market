package market.properties;

import org.springframework.beans.factory.annotation.Value;

public class PaginationProperties {
	private int backendProduct;
	private int backendOrder;

	public PaginationProperties() {
	}

	public PaginationProperties(
		@Value("${pagination.backend.product}") int backendProduct,
		@Value("${pagination.backend.order}") int backendOrder
	) {
		this.backendProduct = backendProduct;
		this.backendOrder = backendOrder;
	}

	public int getBackendProduct() {
		return backendProduct;
	}

	public int getBackendOrder() {
		return backendOrder;
	}

	public static class Builder {
		private int backendProduct;
		private int backendOrder;

		public PaginationProperties build() {
			return new PaginationProperties(backendProduct, backendOrder);
		}

		public Builder setBackendProduct(int backendProduct) {
			this.backendProduct = backendProduct;
			return this;
		}

		public Builder setBackendOrder(int backendOrder) {
			this.backendOrder = backendOrder;
			return this;
		}
	}
}