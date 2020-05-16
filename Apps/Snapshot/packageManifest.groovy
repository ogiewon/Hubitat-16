{
	"packageName": "Home Tracker",
	"minimumHEVersion": "2.1.9",
	"author": "BPTWorld",
	"dateReleased": "2020-04-07",
	"documentationLink": "https://github.com/bptworld/Hubitat",
	"communityLink": "https://community.hubitat.com/t/release-home-tracker-track-the-coming-and-going-of-house-members-with-announcements-and-push-messages/22709",
	"apps" : [
		{
			"id" : "6c909327-a768-4cfa-a19d-914c5d865b44",
			"name": "Snapshot",
			"namespace": "BPTWorld",
			"location": "https://raw.githubusercontent.com/bptworld/Hubitat/master/Apps/Snapshot/S-parent.groovy",
			"required": true,
			"oauth": false,
			"version": "2.0.1"
		},
		{
			"id" : "c5af8fec-d314-4a1f-8a51-15c812532ee8",
			"name": "Snapshot Child",
			"namespace": "BPTWorld",
			"location": "https://raw.githubusercontent.com/bptworld/Hubitat/master/Apps/Snapshot/S-child.groovy",
			"required": true,
			"oauth": false,
			"version": "2.0.2"
		}
    {
			"id" : "5f3f66fd-77ab-4fde-a560-e266cf7a86fd",
			"name": "Snapshot Lite Child",
			"namespace": "BPTWorld",
			"location": "https://raw.githubusercontent.com/bptworld/Hubitat/master/Apps/Snapshot/S-lite-child.groovy",
			"required": true,
			"oauth": false,
			"version": "2.0.1"
		}
	],
	"drivers" : [
		{
			"id": "d4226c26-3ce8-4e20-b8ce-cd9fa311e6e7",
			"name": "Home Tracker Driver",
			"namespace": "BPTWorld",
			"location": "https://github.com/bptworld/Hubitat/blob/master/Apps/Snapshot/S-driver.groovy",
			"required": true,
			"version": "1.1.1"
		}
	]
}
