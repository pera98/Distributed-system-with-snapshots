package app.snapshot_bitcake;

import servent.message.Message;

/**
 * This class is used if the user hasn't specified a snapshot type in config.
 * 
 * @author bmilojkovic
 *
 */
public class NullSnapshotCollector implements SnapshotCollector {

	@Override
	public void run() {}

	@Override
	public void stop() {}

	@Override
	public BitcakeManager getBitcakeManager() {
		return null;
	}

	@Override
	public void addNaiveSnapshotInfo(String snapshotSubject, int amount) {}

	@Override
	public void addLYSnapshotInfo(int id, LYSnapshotResult lySnapshotResult) {

	}

	@Override
	public void addABSnapshotInfo(int id, ABSnapshotResult abSnapshotResult) {

	}

	@Override
	public void addAVDoneMessage(int id, Message message) {

	}


	@Override
	public void startCollecting() {}

}
