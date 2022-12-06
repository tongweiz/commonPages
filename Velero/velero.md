# Cluster migration
* Before migrating your cluster
	* Velero does not natively support the migration of persistent volumes snapshots across cloud providers. If you would like to migrate volume data between cloud platforms, enable File System Backup, which will backup volume contents at the filesystem level.
	* https://velero.io/docs/v1.10/migration-case/#before-migrating-your-cluster 