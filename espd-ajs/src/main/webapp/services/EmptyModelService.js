/* Fornisce model vuoti */
angular.module('espdApp')
    .factory('EmptyModelService', function () {

        var cvpCodeEmpty = {
            itemClassificationCodeModel: {
                itemClassificationCode: "",
                languageID: "",
                listAgencyID: "",
                listAgencyName: "",
                listID: "",
                listName: "",
                listSchemeURI: "",
                listURI: "",
                listVersionID: "",
                name: ""
            }
        }

        var pubSectionEmpty = {
            typeDoc: '',
            name: '',
            description: '',
            noticeNumber: '',
            tempReceivedNumber: '',
            noticeUrl: ''
        }

        var rappresentanteEmpty = {
            "agentPartyModel": {
                "partyIdentificationModels": [],
                "websiteUriModel": {
                    "schemeID": "",
                    "schemeName": "",
                    "schemeAgencyID": "",
                    "schemeAgencyName": "",
                    "schemeVersionID": "",
                    "schemeDataURI": "",
                    "schemeURI": "",
                    "websiteUri": ""
                },
                "endPointIDModel": {
                    "schemeID": "",
                    "schemeName": "",
                    "schemeAgencyID": "",
                    "schemeAgencyName": "",
                    "schemeVersionID": "",
                    "schemeDataURI": "",
                    "schemeURI": "",
                    "endPointID": ""
                },
                "partyNameModels": [],
                "addressModel": {
                    "streetName": "",
                    "cityName": "",
                    "postalZone": "",
                    "countryModel": {
                        "name": "",
                        "identificationCodeModel": {
                            "listID": "CountryCodeIdentifier",
                            "listAgencyID": "",
                            "listAgencyName": "",
                            "listName": "",
                            "listVersionID": "",
                            "name": "",
                            "languageID": "",
                            "listURI": "",
                            "listSchemeURI": "",
                            "countryCodeIdentifier": {
                                "code": null,
                                "name": null,
                                "description": null,
                                "translation": null
                            }
                        },
                        "currency": null,
                        "iso2Code": null,
                        "iso": null
                    },
                    "addressLineModels": []
                },
                "contactModel": {
                    "name": "",
                    "telephone": "",
                    "telefax": "",
                    "email": "",
                    "contactHeader": null,
                    "contactInfo": null,
                    "reportApplicationIssue": null,
                    "reportSecurityIncidentTitle": null,
                    "reportSecurityIncident": null,
                    "backToMain": null
                },
                "serviceProviderPartyModels": [],
                "industryClassificationCodeModel": {
                    "listID": "",
                    "listAgencyID": "",
                    "listAgencyName": "",
                    "listName": "",
                    "listVersionID": "",
                    "name": "",
                    "languageID": "",
                    "listURI": "",
                    "listSchemeURI": "",
                    "eoIndustryClassificationCode": {
                        "code": null,
                        "name": null,
                        "description": null,
                        "translation": null
                    }
                },
                "powerOfAttorneyModels": [],
                "personModels": [
                    {
                        "firstName": "",
                        "familyName": "",
                        "birthDate": null,
                        "birthplaceName": "",
                        "residenceAddressModel": {
                            "streetName": "",
                            "cityName": "",
                            "postalZone": "",
                            "countryModel": {
                                "name": "",
                                "identificationCodeModel": {
                                    "listID": "CountryCodeIdentifier",
                                    "listAgencyID": "",
                                    "listAgencyName": "",
                                    "listName": "",
                                    "listVersionID": "",
                                    "name": "",
                                    "languageID": "",
                                    "listURI": "",
                                    "listSchemeURI": "",
                                    "countryCodeIdentifier": {
                                        "code": null,
                                        "name": null,
                                        "description": null,
                                        "translation": null
                                    }
                                },
                                "currency": null,
                                "iso2Code": null,
                                "iso": null
                            },
                            "addressLineModels": [
                                {
                                    "line": ""
                                }
                            ]
                        },
                        "contactModel": {
                            "name": "",
                            "telephone": "",
                            "telefax": "",
                            "email": "",
                            "contactHeader": null,
                            "contactInfo": null,
                            "reportApplicationIssue": null,
                            "reportSecurityIncidentTitle": null,
                            "reportSecurityIncident": null,
                            "backToMain": null
                        }
                    }
                ]
            },
            "descriptionModels": []
        }

        var procurementProjectLotModel = {
            "idModel": {
                "schemeID": "",
                "schemeName": "",
                "schemeAgencyID": "",
                "schemeAgencyName": "",
                "schemeVersionID": "",
                "schemeDataURI": "",
                "schemeURI": "",
                "id": ""
            }
        }

        return {
            getCvpCodeEmpty: function () {
                return cvpCodeEmpty;
            },
            getPubSectionEmpty: function () {
                return pubSectionEmpty;
            },
            getRappresentanteEmpty: function () {
                return rappresentanteEmpty;
            },
            getProcurementProjectLotModel: function () {
                return procurementProjectLotModel;
            }
        }
    });
