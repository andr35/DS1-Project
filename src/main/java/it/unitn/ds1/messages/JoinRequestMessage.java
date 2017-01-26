package it.unitn.ds1.messages;

import java.io.Serializable;

/**
 * Message used to require to join the system.
 */
public class JoinRequestMessage implements Serializable {

	// TODO: probably not needed
	// message fields
	private final int id;

	/**
	 * Join Request Message: require to leave the system.
	 *
	 * @param id ID of the Node trying to leave the network.
	 */
	public JoinRequestMessage(int id) {
		this.id = id;
	}

	/**
	 * @return The ID of the Node trying to leave.
	 */
	public int getId() {
		return id;
	}
}