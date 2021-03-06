package com.takipi.api.client.request.process;

import com.takipi.api.client.result.process.JvmsResult;
import com.takipi.api.core.request.intf.ApiGetRequest;

public class JvmsRequest extends BaseStatusRequest implements ApiGetRequest<JvmsResult> {

	JvmsRequest(String serviceId, boolean connected) {
		super(serviceId, connected, "jvms");
	}

	@Override
	public Class<JvmsResult> resultClass() {
		return JvmsResult.class;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static class Builder extends BaseStatusRequest.Builder {
		Builder() {

		}

		@Override
		public Builder setServiceId(String serviceId) {
			super.setServiceId(serviceId);

			return this;
		}

		@Override
		public Builder setConnected(boolean connected) {
			super.setConnected(connected);

			return this;
		}

		public JvmsRequest build() {
			validate();

			return new JvmsRequest(serviceId, connected);
		}
	}
}
