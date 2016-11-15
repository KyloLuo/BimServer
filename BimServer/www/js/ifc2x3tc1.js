{
  "classes": {
    "Tristate": {},
    "Ifc2DCompositeCurve": {
      "domain": null,
      "superclasses": [
        "IfcCompositeCurve"
      ],
      "fields": {}
    },
    "IfcActionRequest": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "RequestID": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcActor": {
      "domain": null,
      "superclasses": [
        "IfcObject"
      ],
      "fields": {
        "TheActor": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "IsActingUpon": {
          "type": "IfcRelAssignsToActor",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcActorRole": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Role": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedRole": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcActuatorType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionControlElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAddress": {
      "domain": null,
      "superclasses": [
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Purpose": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "UserDefinedPurpose": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "OfPerson": {
          "type": "IfcPerson",
          "reference": true,
          "many": true
        },
        "OfOrganization": {
          "type": "IfcOrganization",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcAirTerminalBoxType": {
      "domain": null,
      "superclasses": [
        "IfcFlowControllerType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAirTerminalType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAirToAirHeatRecoveryType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAlarmType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionControlElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAngularDimension": {
      "domain": null,
      "superclasses": [
        "IfcDimensionCurveDirectedCallout"
      ],
      "fields": {}
    },
    "IfcAnnotation": {
      "domain": null,
      "superclasses": [
        "IfcProduct"
      ],
      "fields": {
        "ContainedInStructure": {
          "type": "IfcRelContainedInSpatialStructure",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcAnnotationCurveOccurrence": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationOccurrence",
        "IfcDraughtingCalloutElement"
      ],
      "fields": {}
    },
    "IfcAnnotationFillArea": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "OuterBoundary": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "InnerBoundaries": {
          "type": "IfcCurve",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcAnnotationFillAreaOccurrence": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationOccurrence"
      ],
      "fields": {
        "FillStyleTarget": {
          "type": "IfcPoint",
          "reference": true,
          "many": false
        },
        "GlobalOrLocal": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAnnotationOccurrence": {
      "domain": null,
      "superclasses": [
        "IfcStyledItem"
      ],
      "fields": {}
    },
    "IfcAnnotationSurface": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Item": {
          "type": "IfcGeometricRepresentationItem",
          "reference": true,
          "many": false
        },
        "TextureCoordinates": {
          "type": "IfcTextureCoordinate",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcAnnotationSurfaceOccurrence": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationOccurrence"
      ],
      "fields": {}
    },
    "IfcAnnotationSymbolOccurrence": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationOccurrence",
        "IfcDraughtingCalloutElement"
      ],
      "fields": {}
    },
    "IfcAnnotationTextOccurrence": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationOccurrence",
        "IfcDraughtingCalloutElement"
      ],
      "fields": {}
    },
    "IfcApplication": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ApplicationDeveloper": {
          "type": "IfcOrganization",
          "reference": true,
          "many": false
        },
        "Version": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ApplicationFullName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ApplicationIdentifier": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAppliedValue": {
      "domain": null,
      "superclasses": [
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AppliedValue": {
          "type": "IfcAppliedValueSelect",
          "reference": true,
          "many": false
        },
        "UnitBasis": {
          "type": "IfcMeasureWithUnit",
          "reference": true,
          "many": false
        },
        "ApplicableDate": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "FixedUntilDate": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ValuesReferenced": {
          "type": "IfcReferencesValueDocument",
          "reference": true,
          "many": true
        },
        "ValueOfComponents": {
          "type": "IfcAppliedValueRelationship",
          "reference": true,
          "many": true
        },
        "IsComponentIn": {
          "type": "IfcAppliedValueRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcAppliedValueRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ComponentOfTotal": {
          "type": "IfcAppliedValue",
          "reference": true,
          "many": false
        },
        "Components": {
          "type": "IfcAppliedValue",
          "reference": true,
          "many": true
        },
        "ArithmeticOperator": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcApproval": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ApprovalDateTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ApprovalStatus": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ApprovalLevel": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ApprovalQualifier": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Identifier": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Actors": {
          "type": "IfcApprovalActorRelationship",
          "reference": true,
          "many": true
        },
        "IsRelatedWith": {
          "type": "IfcApprovalRelationship",
          "reference": true,
          "many": true
        },
        "Relates": {
          "type": "IfcApprovalRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcApprovalActorRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Actor": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "Approval": {
          "type": "IfcApproval",
          "reference": true,
          "many": false
        },
        "Role": {
          "type": "IfcActorRole",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcApprovalPropertyRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ApprovedProperties": {
          "type": "IfcProperty",
          "reference": true,
          "many": true
        },
        "Approval": {
          "type": "IfcApproval",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcApprovalRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RelatedApproval": {
          "type": "IfcApproval",
          "reference": true,
          "many": false
        },
        "RelatingApproval": {
          "type": "IfcApproval",
          "reference": true,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcArbitraryClosedProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcProfileDef"
      ],
      "fields": {
        "OuterCurve": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcArbitraryOpenProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcProfileDef"
      ],
      "fields": {
        "Curve": {
          "type": "IfcBoundedCurve",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcArbitraryProfileDefWithVoids": {
      "domain": null,
      "superclasses": [
        "IfcArbitraryClosedProfileDef"
      ],
      "fields": {
        "InnerCurves": {
          "type": "IfcCurve",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcAsset": {
      "domain": null,
      "superclasses": [
        "IfcGroup"
      ],
      "fields": {
        "AssetID": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "OriginalValue": {
          "type": "IfcCostValue",
          "reference": true,
          "many": false
        },
        "CurrentValue": {
          "type": "IfcCostValue",
          "reference": true,
          "many": false
        },
        "TotalReplacementCost": {
          "type": "IfcCostValue",
          "reference": true,
          "many": false
        },
        "Owner": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "User": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "ResponsiblePerson": {
          "type": "IfcPerson",
          "reference": true,
          "many": false
        },
        "IncorporationDate": {
          "type": "IfcCalendarDate",
          "reference": true,
          "many": false
        },
        "DepreciatedValue": {
          "type": "IfcCostValue",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcAsymmetricIShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcIShapeProfileDef"
      ],
      "fields": {
        "TopFlangeWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TopFlangeWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TopFlangeThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TopFlangeThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TopFlangeFilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TopFlangeFilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAxis1Placement": {
      "domain": null,
      "superclasses": [
        "IfcPlacement"
      ],
      "fields": {
        "Axis": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcAxis2Placement2D": {
      "domain": null,
      "superclasses": [
        "IfcPlacement",
        "IfcAxis2Placement"
      ],
      "fields": {
        "RefDirection": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcAxis2Placement3D": {
      "domain": null,
      "superclasses": [
        "IfcPlacement",
        "IfcAxis2Placement"
      ],
      "fields": {
        "Axis": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "RefDirection": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcBSplineCurve": {
      "domain": null,
      "superclasses": [
        "IfcBoundedCurve"
      ],
      "fields": {
        "Degree": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "ControlPointsList": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": true
        },
        "CurveForm": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ClosedCurve": {
          "type": "boolean",
          "reference": false,
          "many": false
        },
        "SelfIntersect": {
          "type": "boolean",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBeam": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcBeamType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBezierCurve": {
      "domain": null,
      "superclasses": [
        "IfcBSplineCurve"
      ],
      "fields": {}
    },
    "IfcBlobTexture": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceTexture"
      ],
      "fields": {
        "RasterFormat": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RasterCode": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBlock": {
      "domain": null,
      "superclasses": [
        "IfcCsgPrimitive3D"
      ],
      "fields": {
        "XLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "XLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "YLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "YLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ZLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ZLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoilerType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBooleanClippingResult": {
      "domain": null,
      "superclasses": [
        "IfcBooleanResult"
      ],
      "fields": {}
    },
    "IfcBooleanResult": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcBooleanOperand",
        "IfcCsgSelect"
      ],
      "fields": {
        "Operator": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "FirstOperand": {
          "type": "IfcBooleanOperand",
          "reference": true,
          "many": false
        },
        "SecondOperand": {
          "type": "IfcBooleanOperand",
          "reference": true,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoundaryCondition": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoundaryEdgeCondition": {
      "domain": null,
      "superclasses": [
        "IfcBoundaryCondition"
      ],
      "fields": {
        "LinearStiffnessByLengthX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByLengthXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByLengthY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByLengthYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByLengthZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByLengthZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessByLengthX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessByLengthXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessByLengthY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessByLengthYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessByLengthZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessByLengthZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoundaryFaceCondition": {
      "domain": null,
      "superclasses": [
        "IfcBoundaryCondition"
      ],
      "fields": {
        "LinearStiffnessByAreaX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByAreaXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByAreaY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByAreaYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByAreaZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessByAreaZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoundaryNodeCondition": {
      "domain": null,
      "superclasses": [
        "IfcBoundaryCondition"
      ],
      "fields": {
        "LinearStiffnessX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearStiffnessY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearStiffnessZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearStiffnessZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalStiffnessZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoundaryNodeConditionWarping": {
      "domain": null,
      "superclasses": [
        "IfcBoundaryNodeCondition"
      ],
      "fields": {
        "WarpingStiffness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WarpingStiffnessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoundedCurve": {
      "domain": null,
      "superclasses": [
        "IfcCurve",
        "IfcCurveOrEdgeCurve"
      ],
      "fields": {}
    },
    "IfcBoundedSurface": {
      "domain": null,
      "superclasses": [
        "IfcSurface"
      ],
      "fields": {}
    },
    "IfcBoundingBox": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Corner": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": false
        },
        "XDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "XDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "YDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "YDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ZDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ZDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoxedHalfSpace": {
      "domain": null,
      "superclasses": [
        "IfcHalfSpaceSolid"
      ],
      "fields": {
        "Enclosure": {
          "type": "IfcBoundingBox",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcBuilding": {
      "domain": null,
      "superclasses": [
        "IfcSpatialStructureElement"
      ],
      "fields": {
        "ElevationOfRefHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ElevationOfRefHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ElevationOfTerrain": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ElevationOfTerrainAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BuildingAddress": {
          "type": "IfcPostalAddress",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcBuildingElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcBuildingElementComponent": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcBuildingElementPart": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementComponent"
      ],
      "fields": {}
    },
    "IfcBuildingElementProxy": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "CompositionType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBuildingElementProxyType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBuildingElementType": {
      "domain": null,
      "superclasses": [
        "IfcElementType"
      ],
      "fields": {}
    },
    "IfcBuildingStorey": {
      "domain": null,
      "superclasses": [
        "IfcSpatialStructureElement"
      ],
      "fields": {
        "Elevation": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ElevationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "Depth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Width": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WallThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WallThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Girth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "GirthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "InternalFilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "InternalFilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCableCarrierFittingType": {
      "domain": null,
      "superclasses": [
        "IfcFlowFittingType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCableCarrierSegmentType": {
      "domain": null,
      "superclasses": [
        "IfcFlowSegmentType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCableSegmentType": {
      "domain": null,
      "superclasses": [
        "IfcFlowSegmentType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCalendarDate": {
      "domain": null,
      "superclasses": [
        "IfcDateTimeSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "DayComponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "MonthComponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "YearComponent": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCartesianPoint": {
      "domain": null,
      "superclasses": [
        "IfcPoint",
        "IfcTrimmingSelect"
      ],
      "fields": {
        "Coordinates": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "CoordinatesAsString": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCartesianTransformationOperator": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Axis1": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "Axis2": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "LocalOrigin": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": false
        },
        "Scale": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ScaleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCartesianTransformationOperator2D": {
      "domain": null,
      "superclasses": [
        "IfcCartesianTransformationOperator"
      ],
      "fields": {}
    },
    "IfcCartesianTransformationOperator2DnonUniform": {
      "domain": null,
      "superclasses": [
        "IfcCartesianTransformationOperator2D"
      ],
      "fields": {
        "Scale2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "Scale2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCartesianTransformationOperator3D": {
      "domain": null,
      "superclasses": [
        "IfcCartesianTransformationOperator"
      ],
      "fields": {
        "Axis3": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcCartesianTransformationOperator3DnonUniform": {
      "domain": null,
      "superclasses": [
        "IfcCartesianTransformationOperator3D"
      ],
      "fields": {
        "Scale2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "Scale2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Scale3": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "Scale3AsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCenterLineProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcArbitraryOpenProfileDef"
      ],
      "fields": {
        "Thickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcChamferEdgeFeature": {
      "domain": null,
      "superclasses": [
        "IfcEdgeFeature"
      ],
      "fields": {
        "Width": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Height": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcChillerType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCircle": {
      "domain": null,
      "superclasses": [
        "IfcConic"
      ],
      "fields": {
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCircleHollowProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcCircleProfileDef"
      ],
      "fields": {
        "WallThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WallThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCircleProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcClassification": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Source": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Edition": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EditionDate": {
          "type": "IfcCalendarDate",
          "reference": true,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Contains": {
          "type": "IfcClassificationItem",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcClassificationItem": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Notation": {
          "type": "IfcClassificationNotationFacet",
          "reference": true,
          "many": false
        },
        "ItemOf": {
          "type": "IfcClassification",
          "reference": true,
          "many": false
        },
        "Title": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "IsClassifiedItemIn": {
          "type": "IfcClassificationItemRelationship",
          "reference": true,
          "many": true
        },
        "IsClassifyingItemIn": {
          "type": "IfcClassificationItemRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcClassificationItemRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RelatingItem": {
          "type": "IfcClassificationItem",
          "reference": true,
          "many": false
        },
        "RelatedItems": {
          "type": "IfcClassificationItem",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcClassificationNotation": {
      "domain": null,
      "superclasses": [
        "IfcClassificationNotationSelect"
      ],
      "fields": {
        "NotationFacets": {
          "type": "IfcClassificationNotationFacet",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcClassificationNotationFacet": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "NotationValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcClassificationReference": {
      "domain": null,
      "superclasses": [
        "IfcExternalReference",
        "IfcClassificationNotationSelect"
      ],
      "fields": {
        "ReferencedSource": {
          "type": "IfcClassification",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcClosedShell": {
      "domain": null,
      "superclasses": [
        "IfcConnectedFaceSet",
        "IfcShell"
      ],
      "fields": {}
    },
    "IfcCoilType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcColourRgb": {
      "domain": null,
      "superclasses": [
        "IfcColourSpecification",
        "IfcColourOrFactor"
      ],
      "fields": {
        "Red": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RedAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Green": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "GreenAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Blue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BlueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcColourSpecification": {
      "domain": null,
      "superclasses": [
        "IfcColour"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcColumn": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcColumnType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcComplexProperty": {
      "domain": null,
      "superclasses": [
        "IfcProperty"
      ],
      "fields": {
        "UsageName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HasProperties": {
          "type": "IfcProperty",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcCompositeCurve": {
      "domain": null,
      "superclasses": [
        "IfcBoundedCurve"
      ],
      "fields": {
        "Segments": {
          "type": "IfcCompositeCurveSegment",
          "reference": true,
          "many": true
        },
        "SelfIntersect": {
          "type": "boolean",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCompositeCurveSegment": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Transition": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "SameSense": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ParentCurve": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "UsingCurves": {
          "type": "IfcCompositeCurve",
          "reference": true,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCompositeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcProfileDef"
      ],
      "fields": {
        "Profiles": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": true
        },
        "Label": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCompressorType": {
      "domain": null,
      "superclasses": [
        "IfcFlowMovingDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCondenserType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCondition": {
      "domain": null,
      "superclasses": [
        "IfcGroup"
      ],
      "fields": {}
    },
    "IfcConditionCriterion": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "Criterion": {
          "type": "IfcConditionCriterionSelect",
          "reference": true,
          "many": false
        },
        "CriterionDateTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcConic": {
      "domain": null,
      "superclasses": [
        "IfcCurve"
      ],
      "fields": {
        "Position": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcConnectedFaceSet": {
      "domain": null,
      "superclasses": [
        "IfcTopologicalRepresentationItem"
      ],
      "fields": {
        "CfsFaces": {
          "type": "IfcFace",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcConnectionCurveGeometry": {
      "domain": null,
      "superclasses": [
        "IfcConnectionGeometry"
      ],
      "fields": {
        "CurveOnRelatingElement": {
          "type": "IfcCurveOrEdgeCurve",
          "reference": true,
          "many": false
        },
        "CurveOnRelatedElement": {
          "type": "IfcCurveOrEdgeCurve",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcConnectionGeometry": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcConnectionPointEccentricity": {
      "domain": null,
      "superclasses": [
        "IfcConnectionPointGeometry"
      ],
      "fields": {
        "EccentricityInX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EccentricityInXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EccentricityInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EccentricityInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EccentricityInZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EccentricityInZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcConnectionPointGeometry": {
      "domain": null,
      "superclasses": [
        "IfcConnectionGeometry"
      ],
      "fields": {
        "PointOnRelatingElement": {
          "type": "IfcPointOrVertexPoint",
          "reference": true,
          "many": false
        },
        "PointOnRelatedElement": {
          "type": "IfcPointOrVertexPoint",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcConnectionPortGeometry": {
      "domain": null,
      "superclasses": [
        "IfcConnectionGeometry"
      ],
      "fields": {
        "LocationAtRelatingElement": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        },
        "LocationAtRelatedElement": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        },
        "ProfileOfPort": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcConnectionSurfaceGeometry": {
      "domain": null,
      "superclasses": [
        "IfcConnectionGeometry"
      ],
      "fields": {
        "SurfaceOnRelatingElement": {
          "type": "IfcSurfaceOrFaceSurface",
          "reference": true,
          "many": false
        },
        "SurfaceOnRelatedElement": {
          "type": "IfcSurfaceOrFaceSurface",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcConstraint": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ConstraintGrade": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ConstraintSource": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CreatingActor": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "CreationTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "UserDefinedGrade": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ClassifiedAs": {
          "type": "IfcConstraintClassificationRelationship",
          "reference": true,
          "many": true
        },
        "RelatesConstraints": {
          "type": "IfcConstraintRelationship",
          "reference": true,
          "many": true
        },
        "IsRelatedWith": {
          "type": "IfcConstraintRelationship",
          "reference": true,
          "many": true
        },
        "PropertiesForConstraint": {
          "type": "IfcPropertyConstraintRelationship",
          "reference": true,
          "many": true
        },
        "Aggregates": {
          "type": "IfcConstraintAggregationRelationship",
          "reference": true,
          "many": true
        },
        "IsAggregatedIn": {
          "type": "IfcConstraintAggregationRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcConstraintAggregationRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RelatingConstraint": {
          "type": "IfcConstraint",
          "reference": true,
          "many": false
        },
        "RelatedConstraints": {
          "type": "IfcConstraint",
          "reference": true,
          "many": true
        },
        "LogicalAggregator": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcConstraintClassificationRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ClassifiedConstraint": {
          "type": "IfcConstraint",
          "reference": true,
          "many": false
        },
        "RelatedClassifications": {
          "type": "IfcClassificationNotationSelect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcConstraintRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RelatingConstraint": {
          "type": "IfcConstraint",
          "reference": true,
          "many": false
        },
        "RelatedConstraints": {
          "type": "IfcConstraint",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcConstructionEquipmentResource": {
      "domain": null,
      "superclasses": [
        "IfcConstructionResource"
      ],
      "fields": {}
    },
    "IfcConstructionMaterialResource": {
      "domain": null,
      "superclasses": [
        "IfcConstructionResource"
      ],
      "fields": {
        "Suppliers": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": true
        },
        "UsageRatio": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "UsageRatioAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcConstructionProductResource": {
      "domain": null,
      "superclasses": [
        "IfcConstructionResource"
      ],
      "fields": {}
    },
    "IfcConstructionResource": {
      "domain": null,
      "superclasses": [
        "IfcResource"
      ],
      "fields": {
        "ResourceIdentifier": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ResourceGroup": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ResourceConsumption": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "BaseQuantity": {
          "type": "IfcMeasureWithUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcContextDependentUnit": {
      "domain": null,
      "superclasses": [
        "IfcNamedUnit"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcControl": {
      "domain": null,
      "superclasses": [
        "IfcObject"
      ],
      "fields": {
        "Controls": {
          "type": "IfcRelAssignsToControl",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcControllerType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionControlElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcConversionBasedUnit": {
      "domain": null,
      "superclasses": [
        "IfcNamedUnit"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ConversionFactor": {
          "type": "IfcMeasureWithUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcCooledBeamType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCoolingTowerType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCoordinatedUniversalTimeOffset": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "HourOffset": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "MinuteOffset": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "Sense": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCostItem": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {}
    },
    "IfcCostSchedule": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "SubmittedBy": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "PreparedBy": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "SubmittedOn": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "Status": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TargetUsers": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": true
        },
        "UpdateDate": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ID": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCostValue": {
      "domain": null,
      "superclasses": [
        "IfcAppliedValue",
        "IfcMetricValueSelect"
      ],
      "fields": {
        "CostType": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Condition": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCovering": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "CoversSpaces": {
          "type": "IfcRelCoversSpaces",
          "reference": true,
          "many": true
        },
        "Covers": {
          "type": "IfcRelCoversBldgElements",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcCoveringType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCraneRailAShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "OverallHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BaseWidth2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BaseWidth2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HeadWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeadWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HeadDepth2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeadDepth2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HeadDepth3": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeadDepth3AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BaseWidth4": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BaseWidth4AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BaseDepth1": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BaseDepth1AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BaseDepth2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BaseDepth2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BaseDepth3": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BaseDepth3AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCraneRailFShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "OverallHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HeadWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeadWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HeadDepth2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeadDepth2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HeadDepth3": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeadDepth3AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BaseDepth1": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BaseDepth1AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BaseDepth2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BaseDepth2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCrewResource": {
      "domain": null,
      "superclasses": [
        "IfcConstructionResource"
      ],
      "fields": {}
    },
    "IfcCsgPrimitive3D": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcBooleanOperand",
        "IfcCsgSelect"
      ],
      "fields": {
        "Position": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCsgSolid": {
      "domain": null,
      "superclasses": [
        "IfcSolidModel"
      ],
      "fields": {
        "TreeRootExpression": {
          "type": "IfcCsgSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcCurrencyRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RelatingMonetaryUnit": {
          "type": "IfcMonetaryUnit",
          "reference": true,
          "many": false
        },
        "RelatedMonetaryUnit": {
          "type": "IfcMonetaryUnit",
          "reference": true,
          "many": false
        },
        "ExchangeRate": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ExchangeRateAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RateDateTime": {
          "type": "IfcDateAndTime",
          "reference": true,
          "many": false
        },
        "RateSource": {
          "type": "IfcLibraryInformation",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcCurtainWall": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcCurtainWallType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCurve": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcGeometricSetSelect"
      ],
      "fields": {
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCurveBoundedPlane": {
      "domain": null,
      "superclasses": [
        "IfcBoundedSurface"
      ],
      "fields": {
        "BasisSurface": {
          "type": "IfcPlane",
          "reference": true,
          "many": false
        },
        "OuterBoundary": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "InnerBoundaries": {
          "type": "IfcCurve",
          "reference": true,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCurveStyle": {
      "domain": null,
      "superclasses": [
        "IfcPresentationStyle",
        "IfcPresentationStyleSelect"
      ],
      "fields": {
        "CurveFont": {
          "type": "IfcCurveFontOrScaledCurveFontSelect",
          "reference": true,
          "many": false
        },
        "CurveWidth": {
          "type": "IfcSizeSelect",
          "reference": true,
          "many": false
        },
        "CurveColour": {
          "type": "IfcColour",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcCurveStyleFont": {
      "domain": null,
      "superclasses": [
        "IfcCurveStyleFontSelect"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PatternList": {
          "type": "IfcCurveStyleFontPattern",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcCurveStyleFontAndScaling": {
      "domain": null,
      "superclasses": [
        "IfcCurveFontOrScaledCurveFontSelect"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CurveFont": {
          "type": "IfcCurveStyleFontSelect",
          "reference": true,
          "many": false
        },
        "CurveFontScaling": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CurveFontScalingAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCurveStyleFontPattern": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "VisibleSegmentLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VisibleSegmentLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "InvisibleSegmentLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "InvisibleSegmentLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDamperType": {
      "domain": null,
      "superclasses": [
        "IfcFlowControllerType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDateAndTime": {
      "domain": null,
      "superclasses": [
        "IfcDateTimeSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "DateComponent": {
          "type": "IfcCalendarDate",
          "reference": true,
          "many": false
        },
        "TimeComponent": {
          "type": "IfcLocalTime",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcDefinedSymbol": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Definition": {
          "type": "IfcDefinedSymbolSelect",
          "reference": true,
          "many": false
        },
        "Target": {
          "type": "IfcCartesianTransformationOperator2D",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcDerivedProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcProfileDef"
      ],
      "fields": {
        "ParentProfile": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": false
        },
        "Operator": {
          "type": "IfcCartesianTransformationOperator2D",
          "reference": true,
          "many": false
        },
        "Label": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDerivedUnit": {
      "domain": null,
      "superclasses": [
        "IfcUnit"
      ],
      "fields": {
        "Elements": {
          "type": "IfcDerivedUnitElement",
          "reference": true,
          "many": true
        },
        "UnitType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedType": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDerivedUnitElement": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Unit": {
          "type": "IfcNamedUnit",
          "reference": true,
          "many": false
        },
        "Exponent": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDiameterDimension": {
      "domain": null,
      "superclasses": [
        "IfcDimensionCurveDirectedCallout"
      ],
      "fields": {}
    },
    "IfcDimensionCalloutRelationship": {
      "domain": null,
      "superclasses": [
        "IfcDraughtingCalloutRelationship"
      ],
      "fields": {}
    },
    "IfcDimensionCurve": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationCurveOccurrence"
      ],
      "fields": {
        "AnnotatedBySymbols": {
          "type": "IfcTerminatorSymbol",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcDimensionCurveDirectedCallout": {
      "domain": null,
      "superclasses": [
        "IfcDraughtingCallout"
      ],
      "fields": {}
    },
    "IfcDimensionCurveTerminator": {
      "domain": null,
      "superclasses": [
        "IfcTerminatorSymbol"
      ],
      "fields": {
        "Role": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDimensionPair": {
      "domain": null,
      "superclasses": [
        "IfcDraughtingCalloutRelationship"
      ],
      "fields": {}
    },
    "IfcDimensionalExponents": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "LengthExponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "MassExponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "TimeExponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "ElectricCurrentExponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "ThermodynamicTemperatureExponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "AmountOfSubstanceExponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "LuminousIntensityExponent": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDirection": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcOrientationSelect",
        "IfcVectorOrDirection"
      ],
      "fields": {
        "DirectionRatios": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "DirectionRatiosAsString": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDiscreteAccessory": {
      "domain": null,
      "superclasses": [
        "IfcElementComponent"
      ],
      "fields": {}
    },
    "IfcDiscreteAccessoryType": {
      "domain": null,
      "superclasses": [
        "IfcElementComponentType"
      ],
      "fields": {}
    },
    "IfcDistributionChamberElement": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcDistributionChamberElementType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDistributionControlElement": {
      "domain": null,
      "superclasses": [
        "IfcDistributionElement"
      ],
      "fields": {
        "ControlElementId": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AssignedToFlowElement": {
          "type": "IfcRelFlowControlElements",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcDistributionControlElementType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionElementType"
      ],
      "fields": {}
    },
    "IfcDistributionElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcDistributionElementType": {
      "domain": null,
      "superclasses": [
        "IfcElementType"
      ],
      "fields": {}
    },
    "IfcDistributionFlowElement": {
      "domain": null,
      "superclasses": [
        "IfcDistributionElement"
      ],
      "fields": {
        "HasControlElements": {
          "type": "IfcRelFlowControlElements",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcDistributionFlowElementType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionElementType"
      ],
      "fields": {}
    },
    "IfcDistributionPort": {
      "domain": null,
      "superclasses": [
        "IfcPort"
      ],
      "fields": {
        "FlowDirection": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDocumentElectronicFormat": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "FileExtension": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MimeContentType": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MimeSubtype": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDocumentInformation": {
      "domain": null,
      "superclasses": [
        "IfcDocumentSelect"
      ],
      "fields": {
        "DocumentId": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DocumentReferences": {
          "type": "IfcDocumentReference",
          "reference": true,
          "many": true
        },
        "Purpose": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "IntendedUse": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Scope": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Revision": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DocumentOwner": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "Editors": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": true
        },
        "CreationTime": {
          "type": "IfcDateAndTime",
          "reference": true,
          "many": false
        },
        "LastRevisionTime": {
          "type": "IfcDateAndTime",
          "reference": true,
          "many": false
        },
        "ElectronicFormat": {
          "type": "IfcDocumentElectronicFormat",
          "reference": true,
          "many": false
        },
        "ValidFrom": {
          "type": "IfcCalendarDate",
          "reference": true,
          "many": false
        },
        "ValidUntil": {
          "type": "IfcCalendarDate",
          "reference": true,
          "many": false
        },
        "Confidentiality": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Status": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "IsPointedTo": {
          "type": "IfcDocumentInformationRelationship",
          "reference": true,
          "many": true
        },
        "IsPointer": {
          "type": "IfcDocumentInformationRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcDocumentInformationRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RelatingDocument": {
          "type": "IfcDocumentInformation",
          "reference": true,
          "many": false
        },
        "RelatedDocuments": {
          "type": "IfcDocumentInformation",
          "reference": true,
          "many": true
        },
        "RelationshipType": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDocumentReference": {
      "domain": null,
      "superclasses": [
        "IfcExternalReference",
        "IfcDocumentSelect"
      ],
      "fields": {
        "ReferenceToDocument": {
          "type": "IfcDocumentInformation",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcDoor": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "OverallHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "OverallWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDoorLiningProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "LiningDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LiningDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LiningThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LiningThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThresholdDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThresholdDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThresholdThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThresholdThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TransomThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransomThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TransomOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransomOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LiningOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LiningOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThresholdOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThresholdOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CasingThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CasingThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CasingDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CasingDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShapeAspectStyle": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcDoorPanelProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "PanelDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PanelDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PanelOperation": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "PanelWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PanelWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PanelPosition": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ShapeAspectStyle": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcDoorStyle": {
      "domain": null,
      "superclasses": [
        "IfcTypeProduct"
      ],
      "fields": {
        "OperationType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ConstructionType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ParameterTakesPrecedence": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Sizeable": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDraughtingCallout": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Contents": {
          "type": "IfcDraughtingCalloutElement",
          "reference": true,
          "many": true
        },
        "IsRelatedFromCallout": {
          "type": "IfcDraughtingCalloutRelationship",
          "reference": true,
          "many": true
        },
        "IsRelatedToCallout": {
          "type": "IfcDraughtingCalloutRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcDraughtingCalloutRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RelatingDraughtingCallout": {
          "type": "IfcDraughtingCallout",
          "reference": true,
          "many": false
        },
        "RelatedDraughtingCallout": {
          "type": "IfcDraughtingCallout",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcDraughtingPreDefinedColour": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedColour"
      ],
      "fields": {}
    },
    "IfcDraughtingPreDefinedCurveFont": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedCurveFont"
      ],
      "fields": {}
    },
    "IfcDraughtingPreDefinedTextFont": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedTextFont"
      ],
      "fields": {}
    },
    "IfcDuctFittingType": {
      "domain": null,
      "superclasses": [
        "IfcFlowFittingType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDuctSegmentType": {
      "domain": null,
      "superclasses": [
        "IfcFlowSegmentType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDuctSilencerType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTreatmentDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEdge": {
      "domain": null,
      "superclasses": [
        "IfcTopologicalRepresentationItem"
      ],
      "fields": {
        "EdgeStart": {
          "type": "IfcVertex",
          "reference": true,
          "many": false
        },
        "EdgeEnd": {
          "type": "IfcVertex",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcEdgeCurve": {
      "domain": null,
      "superclasses": [
        "IfcEdge",
        "IfcCurveOrEdgeCurve"
      ],
      "fields": {
        "EdgeGeometry": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "SameSense": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEdgeFeature": {
      "domain": null,
      "superclasses": [
        "IfcFeatureElementSubtraction"
      ],
      "fields": {
        "FeatureLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FeatureLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEdgeLoop": {
      "domain": null,
      "superclasses": [
        "IfcLoop"
      ],
      "fields": {
        "EdgeList": {
          "type": "IfcOrientedEdge",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcElectricApplianceType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricDistributionPoint": {
      "domain": null,
      "superclasses": [
        "IfcFlowController"
      ],
      "fields": {
        "DistributionPointFunction": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedFunction": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricFlowStorageDeviceType": {
      "domain": null,
      "superclasses": [
        "IfcFlowStorageDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricGeneratorType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricHeaterType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricMotorType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricTimeControlType": {
      "domain": null,
      "superclasses": [
        "IfcFlowControllerType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricalBaseProperties": {
      "domain": null,
      "superclasses": [
        "IfcEnergyProperties"
      ],
      "fields": {
        "ElectricCurrentType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "InputVoltage": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "InputVoltageAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "InputFrequency": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "InputFrequencyAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FullLoadCurrent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FullLoadCurrentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MinimumCircuitCurrent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MinimumCircuitCurrentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MaximumPowerInput": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MaximumPowerInputAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RatedPowerInput": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RatedPowerInputAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "InputPhase": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricalCircuit": {
      "domain": null,
      "superclasses": [
        "IfcSystem"
      ],
      "fields": {}
    },
    "IfcElectricalElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcElement": {
      "domain": null,
      "superclasses": [
        "IfcProduct",
        "IfcStructuralActivityAssignmentSelect"
      ],
      "fields": {
        "Tag": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HasStructuralMember": {
          "type": "IfcRelConnectsStructuralElement",
          "reference": true,
          "many": true
        },
        "FillsVoids": {
          "type": "IfcRelFillsElement",
          "reference": true,
          "many": true
        },
        "ConnectedTo": {
          "type": "IfcRelConnectsElements",
          "reference": true,
          "many": true
        },
        "HasCoverings": {
          "type": "IfcRelCoversBldgElements",
          "reference": true,
          "many": true
        },
        "HasProjections": {
          "type": "IfcRelProjectsElement",
          "reference": true,
          "many": true
        },
        "ReferencedInStructures": {
          "type": "IfcRelReferencedInSpatialStructure",
          "reference": true,
          "many": true
        },
        "HasPorts": {
          "type": "IfcRelConnectsPortToElement",
          "reference": true,
          "many": true
        },
        "HasOpenings": {
          "type": "IfcRelVoidsElement",
          "reference": true,
          "many": true
        },
        "IsConnectionRealization": {
          "type": "IfcRelConnectsWithRealizingElements",
          "reference": true,
          "many": true
        },
        "ProvidesBoundaries": {
          "type": "IfcRelSpaceBoundary",
          "reference": true,
          "many": true
        },
        "ConnectedFrom": {
          "type": "IfcRelConnectsElements",
          "reference": true,
          "many": true
        },
        "ContainedInStructure": {
          "type": "IfcRelContainedInSpatialStructure",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcElementAssembly": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {
        "AssemblyPlace": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElementComponent": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcElementComponentType": {
      "domain": null,
      "superclasses": [
        "IfcElementType"
      ],
      "fields": {}
    },
    "IfcElementQuantity": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "MethodOfMeasurement": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Quantities": {
          "type": "IfcPhysicalQuantity",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcElementType": {
      "domain": null,
      "superclasses": [
        "IfcTypeProduct"
      ],
      "fields": {
        "ElementType": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElementarySurface": {
      "domain": null,
      "superclasses": [
        "IfcSurface"
      ],
      "fields": {
        "Position": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEllipse": {
      "domain": null,
      "superclasses": [
        "IfcConic"
      ],
      "fields": {
        "SemiAxis1": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SemiAxis1AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SemiAxis2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SemiAxis2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEllipseProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "SemiAxis1": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SemiAxis1AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SemiAxis2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SemiAxis2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEnergyConversionDevice": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcEnergyConversionDeviceType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcEnergyProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "EnergySequence": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedEnergySequence": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEnvironmentalImpactValue": {
      "domain": null,
      "superclasses": [
        "IfcAppliedValue"
      ],
      "fields": {
        "ImpactType": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Category": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedCategory": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEquipmentElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcEquipmentStandard": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {}
    },
    "IfcEvaporativeCoolerType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEvaporatorType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcExtendedMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "ExtendedProperties": {
          "type": "IfcProperty",
          "reference": true,
          "many": true
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcExternalReference": {
      "domain": null,
      "superclasses": [
        "IfcLightDistributionDataSourceSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Location": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ItemReference": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcExternallyDefinedHatchStyle": {
      "domain": null,
      "superclasses": [
        "IfcExternalReference",
        "IfcFillStyleSelect"
      ],
      "fields": {}
    },
    "IfcExternallyDefinedSurfaceStyle": {
      "domain": null,
      "superclasses": [
        "IfcExternalReference",
        "IfcSurfaceStyleElementSelect"
      ],
      "fields": {}
    },
    "IfcExternallyDefinedSymbol": {
      "domain": null,
      "superclasses": [
        "IfcExternalReference",
        "IfcDefinedSymbolSelect"
      ],
      "fields": {}
    },
    "IfcExternallyDefinedTextFont": {
      "domain": null,
      "superclasses": [
        "IfcExternalReference",
        "IfcTextFontSelect"
      ],
      "fields": {}
    },
    "IfcExtrudedAreaSolid": {
      "domain": null,
      "superclasses": [
        "IfcSweptAreaSolid"
      ],
      "fields": {
        "ExtrudedDirection": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "Depth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFace": {
      "domain": null,
      "superclasses": [
        "IfcTopologicalRepresentationItem"
      ],
      "fields": {
        "Bounds": {
          "type": "IfcFaceBound",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcFaceBasedSurfaceModel": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcSurfaceOrFaceSurface"
      ],
      "fields": {
        "FbsmFaces": {
          "type": "IfcConnectedFaceSet",
          "reference": true,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFaceBound": {
      "domain": null,
      "superclasses": [
        "IfcTopologicalRepresentationItem"
      ],
      "fields": {
        "Bound": {
          "type": "IfcLoop",
          "reference": true,
          "many": false
        },
        "Orientation": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFaceOuterBound": {
      "domain": null,
      "superclasses": [
        "IfcFaceBound"
      ],
      "fields": {}
    },
    "IfcFaceSurface": {
      "domain": null,
      "superclasses": [
        "IfcFace",
        "IfcSurfaceOrFaceSurface"
      ],
      "fields": {
        "FaceSurface": {
          "type": "IfcSurface",
          "reference": true,
          "many": false
        },
        "SameSense": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFacetedBrep": {
      "domain": null,
      "superclasses": [
        "IfcManifoldSolidBrep"
      ],
      "fields": {}
    },
    "IfcFacetedBrepWithVoids": {
      "domain": null,
      "superclasses": [
        "IfcManifoldSolidBrep"
      ],
      "fields": {
        "Voids": {
          "type": "IfcClosedShell",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcFailureConnectionCondition": {
      "domain": null,
      "superclasses": [
        "IfcStructuralConnectionCondition"
      ],
      "fields": {
        "TensionFailureX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TensionFailureXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TensionFailureY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TensionFailureYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TensionFailureZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TensionFailureZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CompressionFailureX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CompressionFailureXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CompressionFailureY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CompressionFailureYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CompressionFailureZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CompressionFailureZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFanType": {
      "domain": null,
      "superclasses": [
        "IfcFlowMovingDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFastener": {
      "domain": null,
      "superclasses": [
        "IfcElementComponent"
      ],
      "fields": {}
    },
    "IfcFastenerType": {
      "domain": null,
      "superclasses": [
        "IfcElementComponentType"
      ],
      "fields": {}
    },
    "IfcFeatureElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcFeatureElementAddition": {
      "domain": null,
      "superclasses": [
        "IfcFeatureElement"
      ],
      "fields": {
        "ProjectsElements": {
          "type": "IfcRelProjectsElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcFeatureElementSubtraction": {
      "domain": null,
      "superclasses": [
        "IfcFeatureElement"
      ],
      "fields": {
        "VoidsElements": {
          "type": "IfcRelVoidsElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcFillAreaStyle": {
      "domain": null,
      "superclasses": [
        "IfcPresentationStyle",
        "IfcPresentationStyleSelect"
      ],
      "fields": {
        "FillStyles": {
          "type": "IfcFillStyleSelect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcFillAreaStyleHatching": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcFillStyleSelect"
      ],
      "fields": {
        "HatchLineAppearance": {
          "type": "IfcCurveStyle",
          "reference": true,
          "many": false
        },
        "StartOfNextHatchLine": {
          "type": "IfcHatchLineDistanceSelect",
          "reference": true,
          "many": false
        },
        "PointOfReferenceHatchLine": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": false
        },
        "PatternStart": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": false
        },
        "HatchLineAngle": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HatchLineAngleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFillAreaStyleTileSymbolWithStyle": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcFillAreaStyleTileShapeSelect"
      ],
      "fields": {
        "Symbol": {
          "type": "IfcAnnotationSymbolOccurrence",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcFillAreaStyleTiles": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcFillStyleSelect"
      ],
      "fields": {
        "TilingPattern": {
          "type": "IfcOneDirectionRepeatFactor",
          "reference": true,
          "many": false
        },
        "Tiles": {
          "type": "IfcFillAreaStyleTileShapeSelect",
          "reference": true,
          "many": true
        },
        "TilingScale": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TilingScaleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFilterType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTreatmentDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFireSuppressionTerminalType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFlowController": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcFlowControllerType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcFlowFitting": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcFlowFittingType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcFlowInstrumentType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionControlElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFlowMeterType": {
      "domain": null,
      "superclasses": [
        "IfcFlowControllerType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFlowMovingDevice": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcFlowMovingDeviceType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcFlowSegment": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcFlowSegmentType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcFlowStorageDevice": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcFlowStorageDeviceType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcFlowTerminal": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcFlowTerminalType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcFlowTreatmentDevice": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElement"
      ],
      "fields": {}
    },
    "IfcFlowTreatmentDeviceType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionFlowElementType"
      ],
      "fields": {}
    },
    "IfcFluidFlowProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "PropertySource": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "FlowConditionTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "VelocityTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "FlowrateTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "Fluid": {
          "type": "IfcMaterial",
          "reference": true,
          "many": false
        },
        "PressureTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "UserDefinedPropertySource": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TemperatureSingleValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TemperatureSingleValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WetBulbTemperatureSingleValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WetBulbTemperatureSingleValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WetBulbTemperatureTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "TemperatureTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "FlowrateSingleValue": {
          "type": "IfcDerivedMeasureValue",
          "reference": true,
          "many": false
        },
        "FlowConditionSingleValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlowConditionSingleValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "VelocitySingleValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VelocitySingleValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PressureSingleValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PressureSingleValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFooting": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFuelProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "CombustionTemperature": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CombustionTemperatureAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CarbonContent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CarbonContentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LowerHeatingValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LowerHeatingValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HigherHeatingValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HigherHeatingValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFurnishingElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcFurnishingElementType": {
      "domain": null,
      "superclasses": [
        "IfcElementType"
      ],
      "fields": {}
    },
    "IfcFurnitureStandard": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {}
    },
    "IfcFurnitureType": {
      "domain": null,
      "superclasses": [
        "IfcFurnishingElementType"
      ],
      "fields": {
        "AssemblyPlace": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcGasTerminalType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcGeneralMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "MolecularWeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MolecularWeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Porosity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PorosityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MassDensity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MassDensityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcGeneralProfileProperties": {
      "domain": null,
      "superclasses": [
        "IfcProfileProperties"
      ],
      "fields": {
        "PhysicalWeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PhysicalWeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Perimeter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PerimeterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MinimumPlateThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MinimumPlateThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MaximumPlateThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MaximumPlateThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CrossSectionArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CrossSectionAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcGeometricCurveSet": {
      "domain": null,
      "superclasses": [
        "IfcGeometricSet"
      ],
      "fields": {}
    },
    "IfcGeometricRepresentationContext": {
      "domain": null,
      "superclasses": [
        "IfcRepresentationContext"
      ],
      "fields": {
        "CoordinateSpaceDimension": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "Precision": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PrecisionAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WorldCoordinateSystem": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        },
        "TrueNorth": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "HasSubContexts": {
          "type": "IfcGeometricRepresentationSubContext",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcGeometricRepresentationItem": {
      "domain": null,
      "superclasses": [
        "IfcRepresentationItem"
      ],
      "fields": {}
    },
    "IfcGeometricRepresentationSubContext": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationContext"
      ],
      "fields": {
        "ParentContext": {
          "type": "IfcGeometricRepresentationContext",
          "reference": true,
          "many": false
        },
        "TargetScale": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TargetScaleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TargetView": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedTargetView": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcGeometricSet": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Elements": {
          "type": "IfcGeometricSetSelect",
          "reference": true,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcGrid": {
      "domain": null,
      "superclasses": [
        "IfcProduct"
      ],
      "fields": {
        "UAxes": {
          "type": "IfcGridAxis",
          "reference": true,
          "many": true
        },
        "VAxes": {
          "type": "IfcGridAxis",
          "reference": true,
          "many": true
        },
        "WAxes": {
          "type": "IfcGridAxis",
          "reference": true,
          "many": true
        },
        "ContainedInStructure": {
          "type": "IfcRelContainedInSpatialStructure",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcGridAxis": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "AxisTag": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AxisCurve": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "SameSense": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "PartOfW": {
          "type": "IfcGrid",
          "reference": true,
          "many": true
        },
        "PartOfV": {
          "type": "IfcGrid",
          "reference": true,
          "many": true
        },
        "PartOfU": {
          "type": "IfcGrid",
          "reference": true,
          "many": true
        },
        "HasIntersections": {
          "type": "IfcVirtualGridIntersection",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcGridPlacement": {
      "domain": null,
      "superclasses": [
        "IfcObjectPlacement"
      ],
      "fields": {
        "PlacementLocation": {
          "type": "IfcVirtualGridIntersection",
          "reference": true,
          "many": false
        },
        "PlacementRefDirection": {
          "type": "IfcVirtualGridIntersection",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcGroup": {
      "domain": null,
      "superclasses": [
        "IfcObject"
      ],
      "fields": {
        "IsGroupedBy": {
          "type": "IfcRelAssignsToGroup",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcHalfSpaceSolid": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcBooleanOperand"
      ],
      "fields": {
        "BaseSurface": {
          "type": "IfcSurface",
          "reference": true,
          "many": false
        },
        "AgreementFlag": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcHeatExchangerType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcHumidifierType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcHygroscopicMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "UpperVaporResistanceFactor": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "UpperVaporResistanceFactorAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LowerVaporResistanceFactor": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LowerVaporResistanceFactorAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "IsothermalMoistureCapacity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "IsothermalMoistureCapacityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "VaporPermeability": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VaporPermeabilityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MoistureDiffusivity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MoistureDiffusivityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcIShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "OverallWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "OverallDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcImageTexture": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceTexture"
      ],
      "fields": {
        "UrlReference": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcInventory": {
      "domain": null,
      "superclasses": [
        "IfcGroup"
      ],
      "fields": {
        "InventoryType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Jurisdiction": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "ResponsiblePersons": {
          "type": "IfcPerson",
          "reference": true,
          "many": true
        },
        "LastUpdateDate": {
          "type": "IfcCalendarDate",
          "reference": true,
          "many": false
        },
        "CurrentValue": {
          "type": "IfcCostValue",
          "reference": true,
          "many": false
        },
        "OriginalValue": {
          "type": "IfcCostValue",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcIrregularTimeSeries": {
      "domain": null,
      "superclasses": [
        "IfcTimeSeries"
      ],
      "fields": {
        "Values": {
          "type": "IfcIrregularTimeSeriesValue",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcIrregularTimeSeriesValue": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "TimeStamp": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ListValues": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcJunctionBoxType": {
      "domain": null,
      "superclasses": [
        "IfcFlowFittingType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "Depth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Width": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Thickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EdgeRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EdgeRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LegSlope": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LegSlopeAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLaborResource": {
      "domain": null,
      "superclasses": [
        "IfcConstructionResource"
      ],
      "fields": {
        "SkillSet": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLampType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLibraryInformation": {
      "domain": null,
      "superclasses": [
        "IfcLibrarySelect"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Version": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Publisher": {
          "type": "IfcOrganization",
          "reference": true,
          "many": false
        },
        "VersionDate": {
          "type": "IfcCalendarDate",
          "reference": true,
          "many": false
        },
        "LibraryReference": {
          "type": "IfcLibraryReference",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcLibraryReference": {
      "domain": null,
      "superclasses": [
        "IfcExternalReference",
        "IfcLibrarySelect"
      ],
      "fields": {
        "ReferenceIntoLibrary": {
          "type": "IfcLibraryInformation",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcLightDistributionData": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "MainPlaneAngle": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MainPlaneAngleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SecondaryPlaneAngle": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "SecondaryPlaneAngleAsString": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "LuminousIntensity": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "LuminousIntensityAsString": {
          "type": "string",
          "reference": false,
          "many": true
        }
      }
    },
    "IfcLightFixtureType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLightIntensityDistribution": {
      "domain": null,
      "superclasses": [
        "IfcLightDistributionDataSourceSelect"
      ],
      "fields": {
        "LightDistributionCurve": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "DistributionData": {
          "type": "IfcLightDistributionData",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcLightSource": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LightColour": {
          "type": "IfcColourRgb",
          "reference": true,
          "many": false
        },
        "AmbientIntensity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "AmbientIntensityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Intensity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "IntensityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLightSourceAmbient": {
      "domain": null,
      "superclasses": [
        "IfcLightSource"
      ],
      "fields": {}
    },
    "IfcLightSourceDirectional": {
      "domain": null,
      "superclasses": [
        "IfcLightSource"
      ],
      "fields": {
        "Orientation": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcLightSourceGoniometric": {
      "domain": null,
      "superclasses": [
        "IfcLightSource"
      ],
      "fields": {
        "Position": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        },
        "ColourAppearance": {
          "type": "IfcColourRgb",
          "reference": true,
          "many": false
        },
        "ColourTemperature": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ColourTemperatureAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LuminousFlux": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LuminousFluxAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LightEmissionSource": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "LightDistributionDataSource": {
          "type": "IfcLightDistributionDataSourceSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcLightSourcePositional": {
      "domain": null,
      "superclasses": [
        "IfcLightSource"
      ],
      "fields": {
        "Position": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": false
        },
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ConstantAttenuation": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ConstantAttenuationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DistanceAttenuation": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DistanceAttenuationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "QuadricAttenuation": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "QuadricAttenuationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLightSourceSpot": {
      "domain": null,
      "superclasses": [
        "IfcLightSourcePositional"
      ],
      "fields": {
        "Orientation": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "ConcentrationExponent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ConcentrationExponentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SpreadAngle": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SpreadAngleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BeamWidthAngle": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BeamWidthAngleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLine": {
      "domain": null,
      "superclasses": [
        "IfcCurve"
      ],
      "fields": {
        "Pnt": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": false
        },
        "Dir": {
          "type": "IfcVector",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcLinearDimension": {
      "domain": null,
      "superclasses": [
        "IfcDimensionCurveDirectedCallout"
      ],
      "fields": {}
    },
    "IfcLocalPlacement": {
      "domain": null,
      "superclasses": [
        "IfcObjectPlacement"
      ],
      "fields": {
        "PlacementRelTo": {
          "type": "IfcObjectPlacement",
          "reference": true,
          "many": false
        },
        "RelativePlacement": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcLocalTime": {
      "domain": null,
      "superclasses": [
        "IfcDateTimeSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "HourComponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "MinuteComponent": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "SecondComponent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SecondComponentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Zone": {
          "type": "IfcCoordinatedUniversalTimeOffset",
          "reference": true,
          "many": false
        },
        "DaylightSavingOffset": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLoop": {
      "domain": null,
      "superclasses": [
        "IfcTopologicalRepresentationItem"
      ],
      "fields": {}
    },
    "IfcManifoldSolidBrep": {
      "domain": null,
      "superclasses": [
        "IfcSolidModel"
      ],
      "fields": {
        "Outer": {
          "type": "IfcClosedShell",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMappedItem": {
      "domain": null,
      "superclasses": [
        "IfcRepresentationItem"
      ],
      "fields": {
        "MappingSource": {
          "type": "IfcRepresentationMap",
          "reference": true,
          "many": false
        },
        "MappingTarget": {
          "type": "IfcCartesianTransformationOperator",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMaterial": {
      "domain": null,
      "superclasses": [
        "IfcMaterialSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HasRepresentation": {
          "type": "IfcMaterialDefinitionRepresentation",
          "reference": true,
          "many": true
        },
        "ClassifiedAs": {
          "type": "IfcMaterialClassificationRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcMaterialClassificationRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "MaterialClassifications": {
          "type": "IfcClassificationNotationSelect",
          "reference": true,
          "many": true
        },
        "ClassifiedMaterial": {
          "type": "IfcMaterial",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMaterialDefinitionRepresentation": {
      "domain": null,
      "superclasses": [
        "IfcProductRepresentation"
      ],
      "fields": {
        "RepresentedMaterial": {
          "type": "IfcMaterial",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMaterialLayer": {
      "domain": null,
      "superclasses": [
        "IfcMaterialSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Material": {
          "type": "IfcMaterial",
          "reference": true,
          "many": false
        },
        "LayerThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LayerThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "IsVentilated": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ToMaterialLayerSet": {
          "type": "IfcMaterialLayerSet",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMaterialLayerSet": {
      "domain": null,
      "superclasses": [
        "IfcMaterialSelect"
      ],
      "fields": {
        "MaterialLayers": {
          "type": "IfcMaterialLayer",
          "reference": true,
          "many": true
        },
        "LayerSetName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TotalThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TotalThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMaterialLayerSetUsage": {
      "domain": null,
      "superclasses": [
        "IfcMaterialSelect"
      ],
      "fields": {
        "ForLayerSet": {
          "type": "IfcMaterialLayerSet",
          "reference": true,
          "many": false
        },
        "LayerSetDirection": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "DirectionSense": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "OffsetFromReferenceLine": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OffsetFromReferenceLineAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMaterialList": {
      "domain": null,
      "superclasses": [
        "IfcMaterialSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Materials": {
          "type": "IfcMaterial",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcMaterialProperties": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Material": {
          "type": "IfcMaterial",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMeasureWithUnit": {
      "domain": null,
      "superclasses": [
        "IfcAppliedValueSelect",
        "IfcConditionCriterionSelect",
        "IfcMetricValueSelect"
      ],
      "fields": {
        "ValueComponent": {
          "type": "IfcValue",
          "reference": true,
          "many": false
        },
        "UnitComponent": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMechanicalConcreteMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMechanicalMaterialProperties"
      ],
      "fields": {
        "CompressiveStrength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CompressiveStrengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MaxAggregateSize": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MaxAggregateSizeAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AdmixturesDescription": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Workability": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ProtectivePoreRatio": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ProtectivePoreRatioAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WaterImpermeability": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMechanicalFastener": {
      "domain": null,
      "superclasses": [
        "IfcFastener"
      ],
      "fields": {
        "NominalDiameter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "NominalDiameterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "NominalLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "NominalLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMechanicalFastenerType": {
      "domain": null,
      "superclasses": [
        "IfcFastenerType"
      ],
      "fields": {}
    },
    "IfcMechanicalMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "DynamicViscosity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DynamicViscosityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "YoungModulus": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "YoungModulusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShearModulus": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ShearModulusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PoissonRatio": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PoissonRatioAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalExpansionCoefficient": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThermalExpansionCoefficientAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMechanicalSteelMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMechanicalMaterialProperties"
      ],
      "fields": {
        "YieldStress": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "YieldStressAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "UltimateStress": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "UltimateStressAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "UltimateStrain": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "UltimateStrainAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HardeningModule": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HardeningModuleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ProportionalStress": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ProportionalStressAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PlasticStrain": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PlasticStrainAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Relaxations": {
          "type": "IfcRelaxation",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcMember": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcMemberType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMetric": {
      "domain": null,
      "superclasses": [
        "IfcConstraint"
      ],
      "fields": {
        "Benchmark": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ValueSource": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DataValue": {
          "type": "IfcMetricValueSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcMonetaryUnit": {
      "domain": null,
      "superclasses": [
        "IfcUnit"
      ],
      "fields": {
        "Currency": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMotorConnectionType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMove": {
      "domain": null,
      "superclasses": [
        "IfcTask"
      ],
      "fields": {
        "MoveFrom": {
          "type": "IfcSpatialStructureElement",
          "reference": true,
          "many": false
        },
        "MoveTo": {
          "type": "IfcSpatialStructureElement",
          "reference": true,
          "many": false
        },
        "PunchList": {
          "type": "string",
          "reference": false,
          "many": true
        }
      }
    },
    "IfcNamedUnit": {
      "domain": null,
      "superclasses": [
        "IfcUnit"
      ],
      "fields": {
        "Dimensions": {
          "type": "IfcDimensionalExponents",
          "reference": true,
          "many": false
        },
        "UnitType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcObject": {
      "domain": null,
      "superclasses": [
        "IfcObjectDefinition"
      ],
      "fields": {
        "ObjectType": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "IsDefinedBy": {
          "type": "IfcRelDefines",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcObjectDefinition": {
      "domain": null,
      "superclasses": [
        "IfcRoot"
      ],
      "fields": {
        "HasAssignments": {
          "type": "IfcRelAssigns",
          "reference": true,
          "many": true
        },
        "IsDecomposedBy": {
          "type": "IfcRelDecomposes",
          "reference": true,
          "many": true
        },
        "Decomposes": {
          "type": "IfcRelDecomposes",
          "reference": true,
          "many": true
        },
        "HasAssociations": {
          "type": "IfcRelAssociates",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcObjectPlacement": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "PlacesObject": {
          "type": "IfcProduct",
          "reference": true,
          "many": true
        },
        "ReferencedByPlacements": {
          "type": "IfcLocalPlacement",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcObjective": {
      "domain": null,
      "superclasses": [
        "IfcConstraint"
      ],
      "fields": {
        "BenchmarkValues": {
          "type": "IfcMetric",
          "reference": true,
          "many": false
        },
        "ResultValues": {
          "type": "IfcMetric",
          "reference": true,
          "many": false
        },
        "ObjectiveQualifier": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedQualifier": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcOccupant": {
      "domain": null,
      "superclasses": [
        "IfcActor"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcOffsetCurve2D": {
      "domain": null,
      "superclasses": [
        "IfcCurve"
      ],
      "fields": {
        "BasisCurve": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "Distance": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DistanceAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SelfIntersect": {
          "type": "boolean",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcOffsetCurve3D": {
      "domain": null,
      "superclasses": [
        "IfcCurve"
      ],
      "fields": {
        "BasisCurve": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "Distance": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DistanceAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SelfIntersect": {
          "type": "boolean",
          "reference": false,
          "many": false
        },
        "RefDirection": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcOneDirectionRepeatFactor": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcHatchLineDistanceSelect"
      ],
      "fields": {
        "RepeatFactor": {
          "type": "IfcVector",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcOpenShell": {
      "domain": null,
      "superclasses": [
        "IfcConnectedFaceSet",
        "IfcShell"
      ],
      "fields": {}
    },
    "IfcOpeningElement": {
      "domain": null,
      "superclasses": [
        "IfcFeatureElementSubtraction"
      ],
      "fields": {
        "HasFillings": {
          "type": "IfcRelFillsElement",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcOpticalMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "VisibleTransmittance": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VisibleTransmittanceAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SolarTransmittance": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SolarTransmittanceAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalIrTransmittance": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThermalIrTransmittanceAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalIrEmissivityBack": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThermalIrEmissivityBackAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalIrEmissivityFront": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThermalIrEmissivityFrontAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "VisibleReflectanceBack": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VisibleReflectanceBackAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "VisibleReflectanceFront": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VisibleReflectanceFrontAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SolarReflectanceFront": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SolarReflectanceFrontAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SolarReflectanceBack": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SolarReflectanceBackAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcOrderAction": {
      "domain": null,
      "superclasses": [
        "IfcTask"
      ],
      "fields": {
        "ActionID": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcOrganization": {
      "domain": null,
      "superclasses": [
        "IfcActorSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Id": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Roles": {
          "type": "IfcActorRole",
          "reference": true,
          "many": true
        },
        "Addresses": {
          "type": "IfcAddress",
          "reference": true,
          "many": true
        },
        "IsRelatedBy": {
          "type": "IfcOrganizationRelationship",
          "reference": true,
          "many": true
        },
        "Relates": {
          "type": "IfcOrganizationRelationship",
          "reference": true,
          "many": true
        },
        "Engages": {
          "type": "IfcPersonAndOrganization",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcOrganizationRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RelatingOrganization": {
          "type": "IfcOrganization",
          "reference": true,
          "many": false
        },
        "RelatedOrganizations": {
          "type": "IfcOrganization",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcOrientedEdge": {
      "domain": null,
      "superclasses": [
        "IfcEdge"
      ],
      "fields": {
        "EdgeElement": {
          "type": "IfcEdge",
          "reference": true,
          "many": false
        },
        "Orientation": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcOutletType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcOwnerHistory": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "OwningUser": {
          "type": "IfcPersonAndOrganization",
          "reference": true,
          "many": false
        },
        "OwningApplication": {
          "type": "IfcApplication",
          "reference": true,
          "many": false
        },
        "State": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ChangeAction": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "LastModifiedDate": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "LastModifyingUser": {
          "type": "IfcPersonAndOrganization",
          "reference": true,
          "many": false
        },
        "LastModifyingApplication": {
          "type": "IfcApplication",
          "reference": true,
          "many": false
        },
        "CreationDate": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcParameterizedProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcProfileDef"
      ],
      "fields": {
        "Position": {
          "type": "IfcAxis2Placement2D",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPath": {
      "domain": null,
      "superclasses": [
        "IfcTopologicalRepresentationItem"
      ],
      "fields": {
        "EdgeList": {
          "type": "IfcOrientedEdge",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPerformanceHistory": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "LifeCyclePhase": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPermeableCoveringProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "OperationType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "PanelPosition": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "FrameDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FrameDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FrameThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FrameThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShapeAspectStyle": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPermit": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "PermitID": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPerson": {
      "domain": null,
      "superclasses": [
        "IfcActorSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Id": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FamilyName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "GivenName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MiddleNames": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "PrefixTitles": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "SuffixTitles": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "Roles": {
          "type": "IfcActorRole",
          "reference": true,
          "many": true
        },
        "Addresses": {
          "type": "IfcAddress",
          "reference": true,
          "many": true
        },
        "EngagedIn": {
          "type": "IfcPersonAndOrganization",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPersonAndOrganization": {
      "domain": null,
      "superclasses": [
        "IfcActorSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "ThePerson": {
          "type": "IfcPerson",
          "reference": true,
          "many": false
        },
        "TheOrganization": {
          "type": "IfcOrganization",
          "reference": true,
          "many": false
        },
        "Roles": {
          "type": "IfcActorRole",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPhysicalComplexQuantity": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalQuantity"
      ],
      "fields": {
        "HasQuantities": {
          "type": "IfcPhysicalQuantity",
          "reference": true,
          "many": true
        },
        "Discrimination": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Quality": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Usage": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPhysicalQuantity": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PartOfComplex": {
          "type": "IfcPhysicalComplexQuantity",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPhysicalSimpleQuantity": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalQuantity"
      ],
      "fields": {
        "Unit": {
          "type": "IfcNamedUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPile": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ConstructionType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPipeFittingType": {
      "domain": null,
      "superclasses": [
        "IfcFlowFittingType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPipeSegmentType": {
      "domain": null,
      "superclasses": [
        "IfcFlowSegmentType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPixelTexture": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceTexture"
      ],
      "fields": {
        "Width": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "Height": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "ColourComponents": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPlacement": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Location": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPlanarBox": {
      "domain": null,
      "superclasses": [
        "IfcPlanarExtent"
      ],
      "fields": {
        "Placement": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPlanarExtent": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "SizeInX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SizeInXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SizeInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SizeInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPlane": {
      "domain": null,
      "superclasses": [
        "IfcElementarySurface"
      ],
      "fields": {}
    },
    "IfcPlate": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcPlateType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPoint": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcGeometricSetSelect",
        "IfcPointOrVertexPoint"
      ],
      "fields": {}
    },
    "IfcPointOnCurve": {
      "domain": null,
      "superclasses": [
        "IfcPoint"
      ],
      "fields": {
        "BasisCurve": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "PointParameter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PointParameterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPointOnSurface": {
      "domain": null,
      "superclasses": [
        "IfcPoint"
      ],
      "fields": {
        "BasisSurface": {
          "type": "IfcSurface",
          "reference": true,
          "many": false
        },
        "PointParameterU": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PointParameterUAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PointParameterV": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PointParameterVAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPolyLoop": {
      "domain": null,
      "superclasses": [
        "IfcLoop"
      ],
      "fields": {
        "Polygon": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPolygonalBoundedHalfSpace": {
      "domain": null,
      "superclasses": [
        "IfcHalfSpaceSolid"
      ],
      "fields": {
        "Position": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        },
        "PolygonalBoundary": {
          "type": "IfcBoundedCurve",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPolyline": {
      "domain": null,
      "superclasses": [
        "IfcBoundedCurve"
      ],
      "fields": {
        "Points": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPort": {
      "domain": null,
      "superclasses": [
        "IfcProduct"
      ],
      "fields": {
        "ContainedIn": {
          "type": "IfcRelConnectsPortToElement",
          "reference": true,
          "many": false
        },
        "ConnectedFrom": {
          "type": "IfcRelConnectsPorts",
          "reference": true,
          "many": true
        },
        "ConnectedTo": {
          "type": "IfcRelConnectsPorts",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPostalAddress": {
      "domain": null,
      "superclasses": [
        "IfcAddress"
      ],
      "fields": {
        "InternalLocation": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AddressLines": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "PostalBox": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Town": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Region": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PostalCode": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Country": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPreDefinedColour": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedItem",
        "IfcColour"
      ],
      "fields": {}
    },
    "IfcPreDefinedCurveFont": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedItem",
        "IfcCurveStyleFontSelect"
      ],
      "fields": {}
    },
    "IfcPreDefinedDimensionSymbol": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedSymbol"
      ],
      "fields": {}
    },
    "IfcPreDefinedItem": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPreDefinedPointMarkerSymbol": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedSymbol"
      ],
      "fields": {}
    },
    "IfcPreDefinedSymbol": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedItem",
        "IfcDefinedSymbolSelect"
      ],
      "fields": {}
    },
    "IfcPreDefinedTerminatorSymbol": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedSymbol"
      ],
      "fields": {}
    },
    "IfcPreDefinedTextFont": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedItem",
        "IfcTextFontSelect"
      ],
      "fields": {}
    },
    "IfcPresentationLayerAssignment": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AssignedItems": {
          "type": "IfcLayeredItem",
          "reference": true,
          "many": true
        },
        "Identifier": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPresentationLayerWithStyle": {
      "domain": null,
      "superclasses": [
        "IfcPresentationLayerAssignment"
      ],
      "fields": {
        "LayerOn": {
          "type": "boolean",
          "reference": false,
          "many": false
        },
        "LayerFrozen": {
          "type": "boolean",
          "reference": false,
          "many": false
        },
        "LayerBlocked": {
          "type": "boolean",
          "reference": false,
          "many": false
        },
        "LayerStyles": {
          "type": "IfcPresentationStyleSelect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPresentationStyle": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPresentationStyleAssignment": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Styles": {
          "type": "IfcPresentationStyleSelect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcProcedure": {
      "domain": null,
      "superclasses": [
        "IfcProcess"
      ],
      "fields": {
        "ProcedureID": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ProcedureType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedProcedureType": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcProcess": {
      "domain": null,
      "superclasses": [
        "IfcObject"
      ],
      "fields": {
        "OperatesOn": {
          "type": "IfcRelAssignsToProcess",
          "reference": true,
          "many": true
        },
        "IsSuccessorFrom": {
          "type": "IfcRelSequence",
          "reference": true,
          "many": true
        },
        "IsPredecessorTo": {
          "type": "IfcRelSequence",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcProduct": {
      "domain": null,
      "superclasses": [
        "IfcObject"
      ],
      "fields": {
        "ObjectPlacement": {
          "type": "IfcObjectPlacement",
          "reference": true,
          "many": false
        },
        "Representation": {
          "type": "IfcProductRepresentation",
          "reference": true,
          "many": false
        },
        "ReferencedBy": {
          "type": "IfcRelAssignsToProduct",
          "reference": true,
          "many": true
        },
        "geometry": {
          "type": "GeometryInfo",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcProductDefinitionShape": {
      "domain": null,
      "superclasses": [
        "IfcProductRepresentation"
      ],
      "fields": {
        "ShapeOfProduct": {
          "type": "IfcProduct",
          "reference": true,
          "many": true
        },
        "HasShapeAspects": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcProductRepresentation": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Representations": {
          "type": "IfcRepresentation",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcProductsOfCombustionProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "SpecificHeatCapacity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SpecificHeatCapacityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "N20Content": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "N20ContentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "COContent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "COContentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CO2Content": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CO2ContentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcProfileDef": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ProfileType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ProfileName": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcProfileProperties": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ProfileName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ProfileDefinition": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcProject": {
      "domain": null,
      "superclasses": [
        "IfcObject"
      ],
      "fields": {
        "LongName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Phase": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RepresentationContexts": {
          "type": "IfcRepresentationContext",
          "reference": true,
          "many": true
        },
        "UnitsInContext": {
          "type": "IfcUnitAssignment",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcProjectOrder": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "ID": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Status": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcProjectOrderRecord": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "Records": {
          "type": "IfcRelAssignsToProjectOrder",
          "reference": true,
          "many": true
        },
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcProjectionCurve": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationCurveOccurrence"
      ],
      "fields": {}
    },
    "IfcProjectionElement": {
      "domain": null,
      "superclasses": [
        "IfcFeatureElementAddition"
      ],
      "fields": {}
    },
    "IfcProperty": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PropertyForDependance": {
          "type": "IfcPropertyDependencyRelationship",
          "reference": true,
          "many": true
        },
        "PropertyDependsOn": {
          "type": "IfcPropertyDependencyRelationship",
          "reference": true,
          "many": true
        },
        "PartOfComplex": {
          "type": "IfcComplexProperty",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPropertyBoundedValue": {
      "domain": null,
      "superclasses": [
        "IfcSimpleProperty"
      ],
      "fields": {
        "UpperBoundValue": {
          "type": "IfcValue",
          "reference": true,
          "many": false
        },
        "LowerBoundValue": {
          "type": "IfcValue",
          "reference": true,
          "many": false
        },
        "Unit": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPropertyConstraintRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RelatingConstraint": {
          "type": "IfcConstraint",
          "reference": true,
          "many": false
        },
        "RelatedProperties": {
          "type": "IfcProperty",
          "reference": true,
          "many": true
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPropertyDefinition": {
      "domain": null,
      "superclasses": [
        "IfcRoot"
      ],
      "fields": {
        "HasAssociations": {
          "type": "IfcRelAssociates",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPropertyDependencyRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "DependingProperty": {
          "type": "IfcProperty",
          "reference": true,
          "many": false
        },
        "DependantProperty": {
          "type": "IfcProperty",
          "reference": true,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Expression": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPropertyEnumeratedValue": {
      "domain": null,
      "superclasses": [
        "IfcSimpleProperty"
      ],
      "fields": {
        "EnumerationValues": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        },
        "EnumerationReference": {
          "type": "IfcPropertyEnumeration",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPropertyEnumeration": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EnumerationValues": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        },
        "Unit": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPropertyListValue": {
      "domain": null,
      "superclasses": [
        "IfcSimpleProperty"
      ],
      "fields": {
        "ListValues": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        },
        "Unit": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPropertyReferenceValue": {
      "domain": null,
      "superclasses": [
        "IfcSimpleProperty"
      ],
      "fields": {
        "UsageName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PropertyReference": {
          "type": "IfcObjectReferenceSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPropertySet": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "HasProperties": {
          "type": "IfcProperty",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPropertySetDefinition": {
      "domain": null,
      "superclasses": [
        "IfcPropertyDefinition"
      ],
      "fields": {
        "PropertyDefinitionOf": {
          "type": "IfcRelDefinesByProperties",
          "reference": true,
          "many": true
        },
        "DefinesType": {
          "type": "IfcTypeObject",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcPropertySingleValue": {
      "domain": null,
      "superclasses": [
        "IfcSimpleProperty"
      ],
      "fields": {
        "NominalValue": {
          "type": "IfcValue",
          "reference": true,
          "many": false
        },
        "Unit": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcPropertyTableValue": {
      "domain": null,
      "superclasses": [
        "IfcSimpleProperty"
      ],
      "fields": {
        "DefiningValues": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        },
        "DefinedValues": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        },
        "Expression": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DefiningUnit": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        },
        "DefinedUnit": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcProtectiveDeviceType": {
      "domain": null,
      "superclasses": [
        "IfcFlowControllerType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcProxy": {
      "domain": null,
      "superclasses": [
        "IfcProduct"
      ],
      "fields": {
        "ProxyType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Tag": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPumpType": {
      "domain": null,
      "superclasses": [
        "IfcFlowMovingDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcQuantityArea": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalSimpleQuantity"
      ],
      "fields": {
        "AreaValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "AreaValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcQuantityCount": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalSimpleQuantity"
      ],
      "fields": {
        "CountValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CountValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcQuantityLength": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalSimpleQuantity"
      ],
      "fields": {
        "LengthValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LengthValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcQuantityTime": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalSimpleQuantity"
      ],
      "fields": {
        "TimeValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TimeValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcQuantityVolume": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalSimpleQuantity"
      ],
      "fields": {
        "VolumeValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VolumeValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcQuantityWeight": {
      "domain": null,
      "superclasses": [
        "IfcPhysicalSimpleQuantity"
      ],
      "fields": {
        "WeightValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WeightValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRadiusDimension": {
      "domain": null,
      "superclasses": [
        "IfcDimensionCurveDirectedCallout"
      ],
      "fields": {}
    },
    "IfcRailing": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRailingType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRamp": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "ShapeType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRampFlight": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcRampFlightType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRationalBezierCurve": {
      "domain": null,
      "superclasses": [
        "IfcBezierCurve"
      ],
      "fields": {
        "WeightsData": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "WeightsDataAsString": {
          "type": "string",
          "reference": false,
          "many": true
        }
      }
    },
    "IfcRectangleHollowProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcRectangleProfileDef"
      ],
      "fields": {
        "WallThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WallThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "InnerFilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "InnerFilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "OuterFilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OuterFilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRectangleProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "XDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "XDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "YDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "YDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRectangularPyramid": {
      "domain": null,
      "superclasses": [
        "IfcCsgPrimitive3D"
      ],
      "fields": {
        "XLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "XLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "YLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "YLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Height": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRectangularTrimmedSurface": {
      "domain": null,
      "superclasses": [
        "IfcBoundedSurface"
      ],
      "fields": {
        "BasisSurface": {
          "type": "IfcSurface",
          "reference": true,
          "many": false
        },
        "U1": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "U1AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "V1": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "V1AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "U2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "U2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "V2": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "V2AsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Usense": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Vsense": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcReferencesValueDocument": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ReferencedDocument": {
          "type": "IfcDocumentSelect",
          "reference": true,
          "many": false
        },
        "ReferencingValues": {
          "type": "IfcAppliedValue",
          "reference": true,
          "many": true
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRegularTimeSeries": {
      "domain": null,
      "superclasses": [
        "IfcTimeSeries"
      ],
      "fields": {
        "TimeStep": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TimeStepAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Values": {
          "type": "IfcTimeSeriesValue",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcReinforcementBarProperties": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "TotalCrossSectionArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TotalCrossSectionAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SteelGrade": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BarSurface": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "EffectiveDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EffectiveDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "NominalBarDiameter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "NominalBarDiameterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BarCount": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BarCountAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcReinforcementDefinitionProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "DefinitionType": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ReinforcementSectionDefinitions": {
          "type": "IfcSectionReinforcementProperties",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcReinforcingBar": {
      "domain": null,
      "superclasses": [
        "IfcReinforcingElement"
      ],
      "fields": {
        "NominalDiameter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "NominalDiameterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CrossSectionArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CrossSectionAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BarLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BarLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BarRole": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "BarSurface": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcReinforcingElement": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementComponent"
      ],
      "fields": {
        "SteelGrade": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcReinforcingMesh": {
      "domain": null,
      "superclasses": [
        "IfcReinforcingElement"
      ],
      "fields": {
        "MeshLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MeshLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MeshWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MeshWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LongitudinalBarNominalDiameter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LongitudinalBarNominalDiameterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TransverseBarNominalDiameter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransverseBarNominalDiameterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LongitudinalBarCrossSectionArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LongitudinalBarCrossSectionAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TransverseBarCrossSectionArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransverseBarCrossSectionAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LongitudinalBarSpacing": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LongitudinalBarSpacingAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TransverseBarSpacing": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransverseBarSpacingAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRelAggregates": {
      "domain": null,
      "superclasses": [
        "IfcRelDecomposes"
      ],
      "fields": {}
    },
    "IfcRelAssigns": {
      "domain": null,
      "superclasses": [
        "IfcRelationship"
      ],
      "fields": {
        "RelatedObjects": {
          "type": "IfcObjectDefinition",
          "reference": true,
          "many": true
        },
        "RelatedObjectsType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRelAssignsTasks": {
      "domain": null,
      "superclasses": [
        "IfcRelAssignsToControl"
      ],
      "fields": {
        "TimeForTask": {
          "type": "IfcScheduleTimeControl",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssignsToActor": {
      "domain": null,
      "superclasses": [
        "IfcRelAssigns"
      ],
      "fields": {
        "RelatingActor": {
          "type": "IfcActor",
          "reference": true,
          "many": false
        },
        "ActingRole": {
          "type": "IfcActorRole",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssignsToControl": {
      "domain": null,
      "superclasses": [
        "IfcRelAssigns"
      ],
      "fields": {
        "RelatingControl": {
          "type": "IfcControl",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssignsToGroup": {
      "domain": null,
      "superclasses": [
        "IfcRelAssigns"
      ],
      "fields": {
        "RelatingGroup": {
          "type": "IfcGroup",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssignsToProcess": {
      "domain": null,
      "superclasses": [
        "IfcRelAssigns"
      ],
      "fields": {
        "RelatingProcess": {
          "type": "IfcProcess",
          "reference": true,
          "many": false
        },
        "QuantityInProcess": {
          "type": "IfcMeasureWithUnit",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssignsToProduct": {
      "domain": null,
      "superclasses": [
        "IfcRelAssigns"
      ],
      "fields": {
        "RelatingProduct": {
          "type": "IfcProduct",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssignsToProjectOrder": {
      "domain": null,
      "superclasses": [
        "IfcRelAssignsToControl"
      ],
      "fields": {}
    },
    "IfcRelAssignsToResource": {
      "domain": null,
      "superclasses": [
        "IfcRelAssigns"
      ],
      "fields": {
        "RelatingResource": {
          "type": "IfcResource",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociates": {
      "domain": null,
      "superclasses": [
        "IfcRelationship"
      ],
      "fields": {
        "RelatedObjects": {
          "type": "IfcRoot",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRelAssociatesAppliedValue": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "RelatingAppliedValue": {
          "type": "IfcAppliedValue",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociatesApproval": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "RelatingApproval": {
          "type": "IfcApproval",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociatesClassification": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "RelatingClassification": {
          "type": "IfcClassificationNotationSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociatesConstraint": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "Intent": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RelatingConstraint": {
          "type": "IfcConstraint",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociatesDocument": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "RelatingDocument": {
          "type": "IfcDocumentSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociatesLibrary": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "RelatingLibrary": {
          "type": "IfcLibrarySelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociatesMaterial": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "RelatingMaterial": {
          "type": "IfcMaterialSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelAssociatesProfileProperties": {
      "domain": null,
      "superclasses": [
        "IfcRelAssociates"
      ],
      "fields": {
        "RelatingProfileProperties": {
          "type": "IfcProfileProperties",
          "reference": true,
          "many": false
        },
        "ProfileSectionLocation": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        },
        "ProfileOrientation": {
          "type": "IfcOrientationSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnects": {
      "domain": null,
      "superclasses": [
        "IfcRelationship"
      ],
      "fields": {}
    },
    "IfcRelConnectsElements": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "ConnectionGeometry": {
          "type": "IfcConnectionGeometry",
          "reference": true,
          "many": false
        },
        "RelatingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        },
        "RelatedElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnectsPathElements": {
      "domain": null,
      "superclasses": [
        "IfcRelConnectsElements"
      ],
      "fields": {
        "RelatingPriorities": {
          "type": "int",
          "reference": false,
          "many": true
        },
        "RelatedPriorities": {
          "type": "int",
          "reference": false,
          "many": true
        },
        "RelatedConnectionType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "RelatingConnectionType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRelConnectsPortToElement": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingPort": {
          "type": "IfcPort",
          "reference": true,
          "many": false
        },
        "RelatedElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnectsPorts": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingPort": {
          "type": "IfcPort",
          "reference": true,
          "many": false
        },
        "RelatedPort": {
          "type": "IfcPort",
          "reference": true,
          "many": false
        },
        "RealizingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnectsStructuralActivity": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingElement": {
          "type": "IfcStructuralActivityAssignmentSelect",
          "reference": true,
          "many": false
        },
        "RelatedStructuralActivity": {
          "type": "IfcStructuralActivity",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnectsStructuralElement": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        },
        "RelatedStructuralMember": {
          "type": "IfcStructuralMember",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnectsStructuralMember": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingStructuralMember": {
          "type": "IfcStructuralMember",
          "reference": true,
          "many": false
        },
        "RelatedStructuralConnection": {
          "type": "IfcStructuralConnection",
          "reference": true,
          "many": false
        },
        "AppliedCondition": {
          "type": "IfcBoundaryCondition",
          "reference": true,
          "many": false
        },
        "AdditionalConditions": {
          "type": "IfcStructuralConnectionCondition",
          "reference": true,
          "many": false
        },
        "SupportedLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SupportedLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ConditionCoordinateSystem": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnectsWithEccentricity": {
      "domain": null,
      "superclasses": [
        "IfcRelConnectsStructuralMember"
      ],
      "fields": {
        "ConnectionConstraint": {
          "type": "IfcConnectionGeometry",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelConnectsWithRealizingElements": {
      "domain": null,
      "superclasses": [
        "IfcRelConnectsElements"
      ],
      "fields": {
        "RealizingElements": {
          "type": "IfcElement",
          "reference": true,
          "many": true
        },
        "ConnectionType": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRelContainedInSpatialStructure": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatedElements": {
          "type": "IfcProduct",
          "reference": true,
          "many": true
        },
        "RelatingStructure": {
          "type": "IfcSpatialStructureElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelCoversBldgElements": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingBuildingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        },
        "RelatedCoverings": {
          "type": "IfcCovering",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRelCoversSpaces": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatedSpace": {
          "type": "IfcSpace",
          "reference": true,
          "many": false
        },
        "RelatedCoverings": {
          "type": "IfcCovering",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRelDecomposes": {
      "domain": null,
      "superclasses": [
        "IfcRelationship"
      ],
      "fields": {
        "RelatingObject": {
          "type": "IfcObjectDefinition",
          "reference": true,
          "many": false
        },
        "RelatedObjects": {
          "type": "IfcObjectDefinition",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRelDefines": {
      "domain": null,
      "superclasses": [
        "IfcRelationship"
      ],
      "fields": {
        "RelatedObjects": {
          "type": "IfcObject",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRelDefinesByProperties": {
      "domain": null,
      "superclasses": [
        "IfcRelDefines"
      ],
      "fields": {
        "RelatingPropertyDefinition": {
          "type": "IfcPropertySetDefinition",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelDefinesByType": {
      "domain": null,
      "superclasses": [
        "IfcRelDefines"
      ],
      "fields": {
        "RelatingType": {
          "type": "IfcTypeObject",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelFillsElement": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingOpeningElement": {
          "type": "IfcOpeningElement",
          "reference": true,
          "many": false
        },
        "RelatedBuildingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelFlowControlElements": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatedControlElements": {
          "type": "IfcDistributionControlElement",
          "reference": true,
          "many": true
        },
        "RelatingFlowElement": {
          "type": "IfcDistributionFlowElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelInteractionRequirements": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "DailyInteraction": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DailyInteractionAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ImportanceRating": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ImportanceRatingAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LocationOfInteraction": {
          "type": "IfcSpatialStructureElement",
          "reference": true,
          "many": false
        },
        "RelatedSpaceProgram": {
          "type": "IfcSpaceProgram",
          "reference": true,
          "many": false
        },
        "RelatingSpaceProgram": {
          "type": "IfcSpaceProgram",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelNests": {
      "domain": null,
      "superclasses": [
        "IfcRelDecomposes"
      ],
      "fields": {}
    },
    "IfcRelOccupiesSpaces": {
      "domain": null,
      "superclasses": [
        "IfcRelAssignsToActor"
      ],
      "fields": {}
    },
    "IfcRelOverridesProperties": {
      "domain": null,
      "superclasses": [
        "IfcRelDefinesByProperties"
      ],
      "fields": {
        "OverridingProperties": {
          "type": "IfcProperty",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRelProjectsElement": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        },
        "RelatedFeatureElement": {
          "type": "IfcFeatureElementAddition",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelReferencedInSpatialStructure": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatedElements": {
          "type": "IfcProduct",
          "reference": true,
          "many": true
        },
        "RelatingStructure": {
          "type": "IfcSpatialStructureElement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelSchedulesCostItems": {
      "domain": null,
      "superclasses": [
        "IfcRelAssignsToControl"
      ],
      "fields": {}
    },
    "IfcRelSequence": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingProcess": {
          "type": "IfcProcess",
          "reference": true,
          "many": false
        },
        "RelatedProcess": {
          "type": "IfcProcess",
          "reference": true,
          "many": false
        },
        "TimeLag": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TimeLagAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SequenceType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRelServicesBuildings": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingSystem": {
          "type": "IfcSystem",
          "reference": true,
          "many": false
        },
        "RelatedBuildings": {
          "type": "IfcSpatialStructureElement",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRelSpaceBoundary": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingSpace": {
          "type": "IfcSpace",
          "reference": true,
          "many": false
        },
        "RelatedBuildingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        },
        "ConnectionGeometry": {
          "type": "IfcConnectionGeometry",
          "reference": true,
          "many": false
        },
        "PhysicalOrVirtualBoundary": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "InternalOrExternalBoundary": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRelVoidsElement": {
      "domain": null,
      "superclasses": [
        "IfcRelConnects"
      ],
      "fields": {
        "RelatingBuildingElement": {
          "type": "IfcElement",
          "reference": true,
          "many": false
        },
        "RelatedOpeningElement": {
          "type": "IfcFeatureElementSubtraction",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcRelationship": {
      "domain": null,
      "superclasses": [
        "IfcRoot"
      ],
      "fields": {}
    },
    "IfcRelaxation": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RelaxationValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RelaxationValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "InitialStress": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "InitialStressAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRepresentation": {
      "domain": null,
      "superclasses": [
        "IfcLayeredItem"
      ],
      "fields": {
        "ContextOfItems": {
          "type": "IfcRepresentationContext",
          "reference": true,
          "many": false
        },
        "RepresentationIdentifier": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RepresentationType": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Items": {
          "type": "IfcRepresentationItem",
          "reference": true,
          "many": true
        },
        "RepresentationMap": {
          "type": "IfcRepresentationMap",
          "reference": true,
          "many": true
        },
        "LayerAssignments": {
          "type": "IfcPresentationLayerAssignment",
          "reference": true,
          "many": true
        },
        "OfProductRepresentation": {
          "type": "IfcProductRepresentation",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRepresentationContext": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ContextIdentifier": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ContextType": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RepresentationsInContext": {
          "type": "IfcRepresentation",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRepresentationItem": {
      "domain": null,
      "superclasses": [
        "IfcLayeredItem"
      ],
      "fields": {
        "LayerAssignments": {
          "type": "IfcPresentationLayerAssignment",
          "reference": true,
          "many": true
        },
        "StyledByItem": {
          "type": "IfcStyledItem",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRepresentationMap": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "MappingOrigin": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        },
        "MappedRepresentation": {
          "type": "IfcRepresentation",
          "reference": true,
          "many": false
        },
        "MapUsage": {
          "type": "IfcMappedItem",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcResource": {
      "domain": null,
      "superclasses": [
        "IfcObject"
      ],
      "fields": {
        "ResourceOf": {
          "type": "IfcRelAssignsToResource",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcRevolvedAreaSolid": {
      "domain": null,
      "superclasses": [
        "IfcSweptAreaSolid"
      ],
      "fields": {
        "Axis": {
          "type": "IfcAxis1Placement",
          "reference": true,
          "many": false
        },
        "Angle": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "AngleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRibPlateProfileProperties": {
      "domain": null,
      "superclasses": [
        "IfcProfileProperties"
      ],
      "fields": {
        "Thickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RibHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RibHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RibWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RibWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RibSpacing": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RibSpacingAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Direction": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRightCircularCone": {
      "domain": null,
      "superclasses": [
        "IfcCsgPrimitive3D"
      ],
      "fields": {
        "Height": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BottomRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BottomRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRightCircularCylinder": {
      "domain": null,
      "superclasses": [
        "IfcCsgPrimitive3D"
      ],
      "fields": {
        "Height": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRoof": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "ShapeType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRoot": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "GlobalId": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "OwnerHistory": {
          "type": "IfcOwnerHistory",
          "reference": true,
          "many": false
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRoundedEdgeFeature": {
      "domain": null,
      "superclasses": [
        "IfcEdgeFeature"
      ],
      "fields": {
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRoundedRectangleProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcRectangleProfileDef"
      ],
      "fields": {
        "RoundingRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RoundingRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSIUnit": {
      "domain": null,
      "superclasses": [
        "IfcNamedUnit"
      ],
      "fields": {
        "Prefix": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Name": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSanitaryTerminalType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcScheduleTimeControl": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "ActualStart": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "EarlyStart": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "LateStart": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ScheduleStart": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ActualFinish": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "EarlyFinish": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "LateFinish": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ScheduleFinish": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "ScheduleDuration": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ScheduleDurationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ActualDuration": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ActualDurationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RemainingTime": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RemainingTimeAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FreeFloat": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FreeFloatAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TotalFloat": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TotalFloatAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "IsCritical": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "StatusTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "StartFloat": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "StartFloatAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FinishFloat": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FinishFloatAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Completion": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CompletionAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ScheduleTimeControlAssigned": {
          "type": "IfcRelAssignsTasks",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSectionProperties": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "SectionType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "StartProfile": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": false
        },
        "EndProfile": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSectionReinforcementProperties": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "LongitudinalStartPosition": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LongitudinalStartPositionAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LongitudinalEndPosition": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LongitudinalEndPositionAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TransversePosition": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransversePositionAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ReinforcementRole": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "SectionDefinition": {
          "type": "IfcSectionProperties",
          "reference": true,
          "many": false
        },
        "CrossSectionReinforcementDefinitions": {
          "type": "IfcReinforcementBarProperties",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSectionedSpine": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "SpineCurve": {
          "type": "IfcCompositeCurve",
          "reference": true,
          "many": false
        },
        "CrossSections": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": true
        },
        "CrossSectionPositions": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSensorType": {
      "domain": null,
      "superclasses": [
        "IfcDistributionControlElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcServiceLife": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "ServiceLifeType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ServiceLifeDuration": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ServiceLifeDurationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcServiceLifeFactor": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UpperValue": {
          "type": "IfcMeasureValue",
          "reference": true,
          "many": false
        },
        "MostUsedValue": {
          "type": "IfcMeasureValue",
          "reference": true,
          "many": false
        },
        "LowerValue": {
          "type": "IfcMeasureValue",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcShapeAspect": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ShapeRepresentations": {
          "type": "IfcShapeModel",
          "reference": true,
          "many": true
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ProductDefinitional": {
          "type": "boolean",
          "reference": false,
          "many": false
        },
        "PartOfProductDefinitionShape": {
          "type": "IfcProductDefinitionShape",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcShapeModel": {
      "domain": null,
      "superclasses": [
        "IfcRepresentation"
      ],
      "fields": {
        "OfShapeAspect": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcShapeRepresentation": {
      "domain": null,
      "superclasses": [
        "IfcShapeModel"
      ],
      "fields": {}
    },
    "IfcShellBasedSurfaceModel": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "SbsmBoundary": {
          "type": "IfcShell",
          "reference": true,
          "many": true
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSimpleProperty": {
      "domain": null,
      "superclasses": [
        "IfcProperty"
      ],
      "fields": {}
    },
    "IfcSite": {
      "domain": null,
      "superclasses": [
        "IfcSpatialStructureElement"
      ],
      "fields": {
        "RefLatitude": {
          "type": "int",
          "reference": false,
          "many": true
        },
        "RefLongitude": {
          "type": "int",
          "reference": false,
          "many": true
        },
        "RefElevation": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RefElevationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LandTitleNumber": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SiteAddress": {
          "type": "IfcPostalAddress",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSlab": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSlabType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSlippageConnectionCondition": {
      "domain": null,
      "superclasses": [
        "IfcStructuralConnectionCondition"
      ],
      "fields": {
        "SlippageX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SlippageXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SlippageY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SlippageYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SlippageZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SlippageZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSolidModel": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcBooleanOperand"
      ],
      "fields": {
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSoundProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "IsAttenuating": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "SoundScale": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "SoundValues": {
          "type": "IfcSoundValue",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSoundValue": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "SoundLevelTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "Frequency": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FrequencyAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SoundLevelSingleValue": {
          "type": "IfcDerivedMeasureValue",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSpace": {
      "domain": null,
      "superclasses": [
        "IfcSpatialStructureElement"
      ],
      "fields": {
        "InteriorOrExteriorSpace": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ElevationWithFlooring": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ElevationWithFlooringAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HasCoverings": {
          "type": "IfcRelCoversSpaces",
          "reference": true,
          "many": true
        },
        "BoundedBy": {
          "type": "IfcRelSpaceBoundary",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSpaceHeaterType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSpaceProgram": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "SpaceProgramIdentifier": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MaxRequiredArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MaxRequiredAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MinRequiredArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MinRequiredAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RequestedLocation": {
          "type": "IfcSpatialStructureElement",
          "reference": true,
          "many": false
        },
        "StandardRequiredArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "StandardRequiredAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HasInteractionReqsFrom": {
          "type": "IfcRelInteractionRequirements",
          "reference": true,
          "many": true
        },
        "HasInteractionReqsTo": {
          "type": "IfcRelInteractionRequirements",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSpaceThermalLoadProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "ApplicableValueRatio": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ApplicableValueRatioAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalLoadSource": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "PropertySource": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "SourceDescription": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MaximumValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MaximumValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MinimumValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MinimumValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalLoadTimeSeriesValues": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "UserDefinedThermalLoadSource": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "UserDefinedPropertySource": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalLoadType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSpaceType": {
      "domain": null,
      "superclasses": [
        "IfcSpatialStructureElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSpatialStructureElement": {
      "domain": null,
      "superclasses": [
        "IfcProduct"
      ],
      "fields": {
        "LongName": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CompositionType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ReferencesElements": {
          "type": "IfcRelReferencedInSpatialStructure",
          "reference": true,
          "many": true
        },
        "ServicedBySystems": {
          "type": "IfcRelServicesBuildings",
          "reference": true,
          "many": true
        },
        "ContainsElements": {
          "type": "IfcRelContainedInSpatialStructure",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSpatialStructureElementType": {
      "domain": null,
      "superclasses": [
        "IfcElementType"
      ],
      "fields": {}
    },
    "IfcSphere": {
      "domain": null,
      "superclasses": [
        "IfcCsgPrimitive3D"
      ],
      "fields": {
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStackTerminalType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStair": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "ShapeType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStairFlight": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "NumberOfRiser": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "NumberOfTreads": {
          "type": "int",
          "reference": false,
          "many": false
        },
        "RiserHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RiserHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TreadLength": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TreadLengthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStairFlightType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralAction": {
      "domain": null,
      "superclasses": [
        "IfcStructuralActivity"
      ],
      "fields": {
        "DestabilizingLoad": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "CausedBy": {
          "type": "IfcStructuralReaction",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcStructuralActivity": {
      "domain": null,
      "superclasses": [
        "IfcProduct"
      ],
      "fields": {
        "AppliedLoad": {
          "type": "IfcStructuralLoad",
          "reference": true,
          "many": false
        },
        "GlobalOrLocal": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "AssignedToStructuralItem": {
          "type": "IfcRelConnectsStructuralActivity",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcStructuralAnalysisModel": {
      "domain": null,
      "superclasses": [
        "IfcSystem"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "OrientationOf2DPlane": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        },
        "LoadedBy": {
          "type": "IfcStructuralLoadGroup",
          "reference": true,
          "many": true
        },
        "HasResults": {
          "type": "IfcStructuralResultGroup",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralConnection": {
      "domain": null,
      "superclasses": [
        "IfcStructuralItem"
      ],
      "fields": {
        "AppliedCondition": {
          "type": "IfcBoundaryCondition",
          "reference": true,
          "many": false
        },
        "ConnectsStructuralMembers": {
          "type": "IfcRelConnectsStructuralMember",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralConnectionCondition": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralCurveConnection": {
      "domain": null,
      "superclasses": [
        "IfcStructuralConnection"
      ],
      "fields": {}
    },
    "IfcStructuralCurveMember": {
      "domain": null,
      "superclasses": [
        "IfcStructuralMember"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralCurveMemberVarying": {
      "domain": null,
      "superclasses": [
        "IfcStructuralCurveMember"
      ],
      "fields": {}
    },
    "IfcStructuralItem": {
      "domain": null,
      "superclasses": [
        "IfcProduct",
        "IfcStructuralActivityAssignmentSelect"
      ],
      "fields": {
        "AssignedStructuralActivity": {
          "type": "IfcRelConnectsStructuralActivity",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralLinearAction": {
      "domain": null,
      "superclasses": [
        "IfcStructuralAction"
      ],
      "fields": {
        "ProjectedOrTrue": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLinearActionVarying": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLinearAction"
      ],
      "fields": {
        "VaryingAppliedLoadLocation": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        },
        "SubsequentAppliedLoads": {
          "type": "IfcStructuralLoad",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralLoad": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLoadGroup": {
      "domain": null,
      "superclasses": [
        "IfcGroup"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ActionType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ActionSource": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Coefficient": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CoefficientAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Purpose": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SourceOfResultGroup": {
          "type": "IfcStructuralResultGroup",
          "reference": true,
          "many": true
        },
        "LoadGroupFor": {
          "type": "IfcStructuralAnalysisModel",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralLoadLinearForce": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoadStatic"
      ],
      "fields": {
        "LinearForceX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearForceXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearForceY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearForceYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearForceZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearForceZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearMomentX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearMomentXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearMomentY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearMomentYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LinearMomentZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LinearMomentZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLoadPlanarForce": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoadStatic"
      ],
      "fields": {
        "PlanarForceX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PlanarForceXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PlanarForceY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PlanarForceYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PlanarForceZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PlanarForceZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLoadSingleDisplacement": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoadStatic"
      ],
      "fields": {
        "DisplacementX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DisplacementXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DisplacementY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DisplacementYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DisplacementZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DisplacementZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalDisplacementRX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalDisplacementRXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalDisplacementRY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalDisplacementRYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "RotationalDisplacementRZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RotationalDisplacementRZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLoadSingleDisplacementDistortion": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoadSingleDisplacement"
      ],
      "fields": {
        "Distortion": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DistortionAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLoadSingleForce": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoadStatic"
      ],
      "fields": {
        "ForceX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ForceXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ForceY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ForceYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ForceZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ForceZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MomentX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MomentXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MomentY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MomentYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MomentZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MomentZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLoadSingleForceWarping": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoadSingleForce"
      ],
      "fields": {
        "WarpingMoment": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WarpingMomentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralLoadStatic": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoad"
      ],
      "fields": {}
    },
    "IfcStructuralLoadTemperature": {
      "domain": null,
      "superclasses": [
        "IfcStructuralLoadStatic"
      ],
      "fields": {
        "DeltaT_Constant": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DeltaT_ConstantAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DeltaT_Y": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DeltaT_YAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DeltaT_Z": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DeltaT_ZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralMember": {
      "domain": null,
      "superclasses": [
        "IfcStructuralItem"
      ],
      "fields": {
        "ReferencesElement": {
          "type": "IfcRelConnectsStructuralElement",
          "reference": true,
          "many": true
        },
        "ConnectedBy": {
          "type": "IfcRelConnectsStructuralMember",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralPlanarAction": {
      "domain": null,
      "superclasses": [
        "IfcStructuralAction"
      ],
      "fields": {
        "ProjectedOrTrue": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralPlanarActionVarying": {
      "domain": null,
      "superclasses": [
        "IfcStructuralPlanarAction"
      ],
      "fields": {
        "VaryingAppliedLoadLocation": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        },
        "SubsequentAppliedLoads": {
          "type": "IfcStructuralLoad",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralPointAction": {
      "domain": null,
      "superclasses": [
        "IfcStructuralAction"
      ],
      "fields": {}
    },
    "IfcStructuralPointConnection": {
      "domain": null,
      "superclasses": [
        "IfcStructuralConnection"
      ],
      "fields": {}
    },
    "IfcStructuralPointReaction": {
      "domain": null,
      "superclasses": [
        "IfcStructuralReaction"
      ],
      "fields": {}
    },
    "IfcStructuralProfileProperties": {
      "domain": null,
      "superclasses": [
        "IfcGeneralProfileProperties"
      ],
      "fields": {
        "TorsionalConstantX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TorsionalConstantXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MomentOfInertiaYZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MomentOfInertiaYZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MomentOfInertiaY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MomentOfInertiaYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MomentOfInertiaZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MomentOfInertiaZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WarpingConstant": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WarpingConstantAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShearCentreZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ShearCentreZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShearCentreY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ShearCentreYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShearDeformationAreaZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ShearDeformationAreaZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShearDeformationAreaY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ShearDeformationAreaYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MaximumSectionModulusY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MaximumSectionModulusYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MinimumSectionModulusY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MinimumSectionModulusYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MaximumSectionModulusZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MaximumSectionModulusZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MinimumSectionModulusZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MinimumSectionModulusZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TorsionalSectionModulus": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TorsionalSectionModulusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralReaction": {
      "domain": null,
      "superclasses": [
        "IfcStructuralActivity"
      ],
      "fields": {
        "Causes": {
          "type": "IfcStructuralAction",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralResultGroup": {
      "domain": null,
      "superclasses": [
        "IfcGroup"
      ],
      "fields": {
        "TheoryType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ResultForLoadGroup": {
          "type": "IfcStructuralLoadGroup",
          "reference": true,
          "many": false
        },
        "IsLinear": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ResultGroupFor": {
          "type": "IfcStructuralAnalysisModel",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcStructuralSteelProfileProperties": {
      "domain": null,
      "superclasses": [
        "IfcStructuralProfileProperties"
      ],
      "fields": {
        "ShearAreaZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ShearAreaZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShearAreaY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ShearAreaYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PlasticShapeFactorY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PlasticShapeFactorYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PlasticShapeFactorZ": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PlasticShapeFactorZAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralSurfaceConnection": {
      "domain": null,
      "superclasses": [
        "IfcStructuralConnection"
      ],
      "fields": {}
    },
    "IfcStructuralSurfaceMember": {
      "domain": null,
      "superclasses": [
        "IfcStructuralMember"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Thickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuralSurfaceMemberVarying": {
      "domain": null,
      "superclasses": [
        "IfcStructuralSurfaceMember"
      ],
      "fields": {
        "SubsequentThickness": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "SubsequentThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "VaryingThicknessLocation": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        },
        "VaryingThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "VaryingThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStructuredDimensionCallout": {
      "domain": null,
      "superclasses": [
        "IfcDraughtingCallout"
      ],
      "fields": {}
    },
    "IfcStyleModel": {
      "domain": null,
      "superclasses": [
        "IfcRepresentation"
      ],
      "fields": {}
    },
    "IfcStyledItem": {
      "domain": null,
      "superclasses": [
        "IfcRepresentationItem"
      ],
      "fields": {
        "Item": {
          "type": "IfcRepresentationItem",
          "reference": true,
          "many": false
        },
        "Styles": {
          "type": "IfcPresentationStyleAssignment",
          "reference": true,
          "many": true
        },
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcStyledRepresentation": {
      "domain": null,
      "superclasses": [
        "IfcStyleModel"
      ],
      "fields": {}
    },
    "IfcSubContractResource": {
      "domain": null,
      "superclasses": [
        "IfcConstructionResource"
      ],
      "fields": {
        "SubContractor": {
          "type": "IfcActorSelect",
          "reference": true,
          "many": false
        },
        "JobDescription": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSubedge": {
      "domain": null,
      "superclasses": [
        "IfcEdge"
      ],
      "fields": {
        "ParentEdge": {
          "type": "IfcEdge",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSurface": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcGeometricSetSelect",
        "IfcSurfaceOrFaceSurface"
      ],
      "fields": {}
    },
    "IfcSurfaceCurveSweptAreaSolid": {
      "domain": null,
      "superclasses": [
        "IfcSweptAreaSolid"
      ],
      "fields": {
        "Directrix": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "StartParam": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "StartParamAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EndParam": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EndParamAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ReferenceSurface": {
          "type": "IfcSurface",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSurfaceOfLinearExtrusion": {
      "domain": null,
      "superclasses": [
        "IfcSweptSurface"
      ],
      "fields": {
        "ExtrudedDirection": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "Depth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSurfaceOfRevolution": {
      "domain": null,
      "superclasses": [
        "IfcSweptSurface"
      ],
      "fields": {
        "AxisPosition": {
          "type": "IfcAxis1Placement",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSurfaceStyle": {
      "domain": null,
      "superclasses": [
        "IfcPresentationStyle",
        "IfcPresentationStyleSelect"
      ],
      "fields": {
        "Side": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Styles": {
          "type": "IfcSurfaceStyleElementSelect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSurfaceStyleLighting": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceStyleElementSelect"
      ],
      "fields": {
        "DiffuseTransmissionColour": {
          "type": "IfcColourRgb",
          "reference": true,
          "many": false
        },
        "DiffuseReflectionColour": {
          "type": "IfcColourRgb",
          "reference": true,
          "many": false
        },
        "TransmissionColour": {
          "type": "IfcColourRgb",
          "reference": true,
          "many": false
        },
        "ReflectanceColour": {
          "type": "IfcColourRgb",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSurfaceStyleRefraction": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceStyleElementSelect"
      ],
      "fields": {
        "RefractionIndex": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RefractionIndexAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DispersionFactor": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DispersionFactorAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSurfaceStyleRendering": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceStyleShading"
      ],
      "fields": {
        "Transparency": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransparencyAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DiffuseColour": {
          "type": "IfcColourOrFactor",
          "reference": true,
          "many": false
        },
        "TransmissionColour": {
          "type": "IfcColourOrFactor",
          "reference": true,
          "many": false
        },
        "DiffuseTransmissionColour": {
          "type": "IfcColourOrFactor",
          "reference": true,
          "many": false
        },
        "ReflectionColour": {
          "type": "IfcColourOrFactor",
          "reference": true,
          "many": false
        },
        "SpecularColour": {
          "type": "IfcColourOrFactor",
          "reference": true,
          "many": false
        },
        "SpecularHighlight": {
          "type": "IfcSpecularHighlightSelect",
          "reference": true,
          "many": false
        },
        "ReflectanceMethod": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSurfaceStyleShading": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceStyleElementSelect"
      ],
      "fields": {
        "SurfaceColour": {
          "type": "IfcColourRgb",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSurfaceStyleWithTextures": {
      "domain": null,
      "superclasses": [
        "IfcSurfaceStyleElementSelect"
      ],
      "fields": {
        "Textures": {
          "type": "IfcSurfaceTexture",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSurfaceTexture": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RepeatS": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "RepeatT": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "TextureType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "TextureTransform": {
          "type": "IfcCartesianTransformationOperator2D",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSweptAreaSolid": {
      "domain": null,
      "superclasses": [
        "IfcSolidModel"
      ],
      "fields": {
        "SweptArea": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": false
        },
        "Position": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSweptDiskSolid": {
      "domain": null,
      "superclasses": [
        "IfcSolidModel"
      ],
      "fields": {
        "Directrix": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "Radius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "RadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "InnerRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "InnerRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "StartParam": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "StartParamAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EndParam": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EndParamAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSweptSurface": {
      "domain": null,
      "superclasses": [
        "IfcSurface"
      ],
      "fields": {
        "SweptCurve": {
          "type": "IfcProfileDef",
          "reference": true,
          "many": false
        },
        "Position": {
          "type": "IfcAxis2Placement3D",
          "reference": true,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSwitchingDeviceType": {
      "domain": null,
      "superclasses": [
        "IfcFlowControllerType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSymbolStyle": {
      "domain": null,
      "superclasses": [
        "IfcPresentationStyle",
        "IfcPresentationStyleSelect"
      ],
      "fields": {
        "StyleOfSymbol": {
          "type": "IfcSymbolStyleSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcSystem": {
      "domain": null,
      "superclasses": [
        "IfcGroup"
      ],
      "fields": {
        "ServicesBuildings": {
          "type": "IfcRelServicesBuildings",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcSystemFurnitureElementType": {
      "domain": null,
      "superclasses": [
        "IfcFurnishingElementType"
      ],
      "fields": {}
    },
    "IfcTShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "Depth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeEdgeRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeEdgeRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebEdgeRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebEdgeRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebSlope": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebSlopeAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeSlope": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeSlopeAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInY": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInYAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTable": {
      "domain": null,
      "superclasses": [
        "IfcMetricValueSelect"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Rows": {
          "type": "IfcTableRow",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTableRow": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "RowCells": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        },
        "IsHeading": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "OfTable": {
          "type": "IfcTable",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTankType": {
      "domain": null,
      "superclasses": [
        "IfcFlowStorageDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTask": {
      "domain": null,
      "superclasses": [
        "IfcProcess"
      ],
      "fields": {
        "TaskId": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Status": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WorkMethod": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "IsMilestone": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Priority": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTelecomAddress": {
      "domain": null,
      "superclasses": [
        "IfcAddress"
      ],
      "fields": {
        "TelephoneNumbers": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "FacsimileNumbers": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "PagerNumber": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ElectronicMailAddresses": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "WWWHomePageURL": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTendon": {
      "domain": null,
      "superclasses": [
        "IfcReinforcingElement"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "NominalDiameter": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "NominalDiameterAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CrossSectionArea": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CrossSectionAreaAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TensionForce": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TensionForceAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PreStress": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PreStressAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FrictionCoefficient": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FrictionCoefficientAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AnchorageSlip": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "AnchorageSlipAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MinCurvatureRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MinCurvatureRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTendonAnchor": {
      "domain": null,
      "superclasses": [
        "IfcReinforcingElement"
      ],
      "fields": {}
    },
    "IfcTerminatorSymbol": {
      "domain": null,
      "superclasses": [
        "IfcAnnotationSymbolOccurrence"
      ],
      "fields": {
        "AnnotatedCurve": {
          "type": "IfcAnnotationCurveOccurrence",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTextLiteral": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem"
      ],
      "fields": {
        "Literal": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Placement": {
          "type": "IfcAxis2Placement",
          "reference": true,
          "many": false
        },
        "Path": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTextLiteralWithExtent": {
      "domain": null,
      "superclasses": [
        "IfcTextLiteral"
      ],
      "fields": {
        "Extent": {
          "type": "IfcPlanarExtent",
          "reference": true,
          "many": false
        },
        "BoxAlignment": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTextStyle": {
      "domain": null,
      "superclasses": [
        "IfcPresentationStyle",
        "IfcPresentationStyleSelect"
      ],
      "fields": {
        "TextCharacterAppearance": {
          "type": "IfcCharacterStyleSelect",
          "reference": true,
          "many": false
        },
        "TextStyle": {
          "type": "IfcTextStyleSelect",
          "reference": true,
          "many": false
        },
        "TextFontStyle": {
          "type": "IfcTextFontSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTextStyleFontModel": {
      "domain": null,
      "superclasses": [
        "IfcPreDefinedTextFont"
      ],
      "fields": {
        "FontFamily": {
          "type": "string",
          "reference": false,
          "many": true
        },
        "FontStyle": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FontVariant": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FontWeight": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FontSize": {
          "type": "IfcSizeSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTextStyleForDefinedFont": {
      "domain": null,
      "superclasses": [
        "IfcCharacterStyleSelect"
      ],
      "fields": {
        "Colour": {
          "type": "IfcColour",
          "reference": true,
          "many": false
        },
        "BackgroundColour": {
          "type": "IfcColour",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTextStyleTextModel": {
      "domain": null,
      "superclasses": [
        "IfcTextStyleSelect"
      ],
      "fields": {
        "TextIndent": {
          "type": "IfcSizeSelect",
          "reference": true,
          "many": false
        },
        "TextAlign": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TextDecoration": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LetterSpacing": {
          "type": "IfcSizeSelect",
          "reference": true,
          "many": false
        },
        "WordSpacing": {
          "type": "IfcSizeSelect",
          "reference": true,
          "many": false
        },
        "TextTransform": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LineHeight": {
          "type": "IfcSizeSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTextStyleWithBoxCharacteristics": {
      "domain": null,
      "superclasses": [
        "IfcTextStyleSelect"
      ],
      "fields": {
        "BoxHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BoxHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BoxWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BoxWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BoxSlantAngle": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BoxSlantAngleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BoxRotateAngle": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BoxRotateAngleAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CharacterSpacing": {
          "type": "IfcSizeSelect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTextureCoordinate": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "AnnotatedSurface": {
          "type": "IfcAnnotationSurface",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTextureCoordinateGenerator": {
      "domain": null,
      "superclasses": [
        "IfcTextureCoordinate"
      ],
      "fields": {
        "Mode": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Parameter": {
          "type": "IfcSimpleValue",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTextureMap": {
      "domain": null,
      "superclasses": [
        "IfcTextureCoordinate"
      ],
      "fields": {
        "TextureMaps": {
          "type": "IfcVertexBasedTextureMap",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTextureVertex": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Coordinates": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "CoordinatesAsString": {
          "type": "string",
          "reference": false,
          "many": true
        }
      }
    },
    "IfcThermalMaterialProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "SpecificHeatCapacity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SpecificHeatCapacityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "BoilingPoint": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BoilingPointAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FreezingPoint": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FreezingPointAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ThermalConductivity": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ThermalConductivityAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTimeSeries": {
      "domain": null,
      "superclasses": [
        "IfcMetricValueSelect",
        "IfcObjectReferenceSelect"
      ],
      "fields": {
        "Name": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Description": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "StartTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "EndTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "TimeSeriesDataType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "DataOrigin": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedDataOrigin": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Unit": {
          "type": "IfcUnit",
          "reference": true,
          "many": false
        },
        "DocumentedBy": {
          "type": "IfcTimeSeriesReferenceRelationship",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTimeSeriesReferenceRelationship": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ReferencedTimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        },
        "TimeSeriesReferences": {
          "type": "IfcDocumentSelect",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTimeSeriesSchedule": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "ApplicableDates": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": true
        },
        "TimeSeriesScheduleType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "TimeSeries": {
          "type": "IfcTimeSeries",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTimeSeriesValue": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "ListValues": {
          "type": "IfcValue",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTopologicalRepresentationItem": {
      "domain": null,
      "superclasses": [
        "IfcRepresentationItem"
      ],
      "fields": {}
    },
    "IfcTopologyRepresentation": {
      "domain": null,
      "superclasses": [
        "IfcShapeModel"
      ],
      "fields": {}
    },
    "IfcTransformerType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTransportElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {
        "OperationType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "CapacityByWeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CapacityByWeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CapacityByNumber": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CapacityByNumberAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTransportElementType": {
      "domain": null,
      "superclasses": [
        "IfcElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTrapeziumProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "BottomXDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "BottomXDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TopXDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TopXDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "YDim": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "YDimAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TopXOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TopXOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTrimmedCurve": {
      "domain": null,
      "superclasses": [
        "IfcBoundedCurve"
      ],
      "fields": {
        "BasisCurve": {
          "type": "IfcCurve",
          "reference": true,
          "many": false
        },
        "Trim1": {
          "type": "IfcTrimmingSelect",
          "reference": true,
          "many": true
        },
        "Trim2": {
          "type": "IfcTrimmingSelect",
          "reference": true,
          "many": true
        },
        "SenseAgreement": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "MasterRepresentation": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTubeBundleType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTwoDirectionRepeatFactor": {
      "domain": null,
      "superclasses": [
        "IfcOneDirectionRepeatFactor"
      ],
      "fields": {
        "SecondRepeatFactor": {
          "type": "IfcVector",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcTypeObject": {
      "domain": null,
      "superclasses": [
        "IfcObjectDefinition"
      ],
      "fields": {
        "ApplicableOccurrence": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "HasPropertySets": {
          "type": "IfcPropertySetDefinition",
          "reference": true,
          "many": true
        },
        "ObjectTypeOf": {
          "type": "IfcRelDefinesByType",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcTypeProduct": {
      "domain": null,
      "superclasses": [
        "IfcTypeObject"
      ],
      "fields": {
        "RepresentationMaps": {
          "type": "IfcRepresentationMap",
          "reference": true,
          "many": true
        },
        "Tag": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcUShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "Depth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EdgeRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EdgeRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeSlope": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeSlopeAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInX": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "CentreOfGravityInXAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcUnitAssignment": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "Units": {
          "type": "IfcUnit",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcUnitaryEquipmentType": {
      "domain": null,
      "superclasses": [
        "IfcEnergyConversionDeviceType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcValveType": {
      "domain": null,
      "superclasses": [
        "IfcFlowControllerType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcVector": {
      "domain": null,
      "superclasses": [
        "IfcGeometricRepresentationItem",
        "IfcVectorOrDirection"
      ],
      "fields": {
        "Orientation": {
          "type": "IfcDirection",
          "reference": true,
          "many": false
        },
        "Magnitude": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MagnitudeAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Dim": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcVertex": {
      "domain": null,
      "superclasses": [
        "IfcTopologicalRepresentationItem"
      ],
      "fields": {}
    },
    "IfcVertexBasedTextureMap": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "TextureVertices": {
          "type": "IfcTextureVertex",
          "reference": true,
          "many": true
        },
        "TexturePoints": {
          "type": "IfcCartesianPoint",
          "reference": true,
          "many": true
        }
      }
    },
    "IfcVertexLoop": {
      "domain": null,
      "superclasses": [
        "IfcLoop"
      ],
      "fields": {
        "LoopVertex": {
          "type": "IfcVertex",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcVertexPoint": {
      "domain": null,
      "superclasses": [
        "IfcVertex",
        "IfcPointOrVertexPoint"
      ],
      "fields": {
        "VertexGeometry": {
          "type": "IfcPoint",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcVibrationIsolatorType": {
      "domain": null,
      "superclasses": [
        "IfcDiscreteAccessoryType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcVirtualElement": {
      "domain": null,
      "superclasses": [
        "IfcElement"
      ],
      "fields": {}
    },
    "IfcVirtualGridIntersection": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "IntersectingAxes": {
          "type": "IfcGridAxis",
          "reference": true,
          "many": true
        },
        "OffsetDistances": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "OffsetDistancesAsString": {
          "type": "string",
          "reference": false,
          "many": true
        }
      }
    },
    "IfcWall": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {}
    },
    "IfcWallStandardCase": {
      "domain": null,
      "superclasses": [
        "IfcWall"
      ],
      "fields": {}
    },
    "IfcWallType": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElementType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWasteTerminalType": {
      "domain": null,
      "superclasses": [
        "IfcFlowTerminalType"
      ],
      "fields": {
        "PredefinedType": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWaterProperties": {
      "domain": null,
      "superclasses": [
        "IfcMaterialProperties"
      ],
      "fields": {
        "IsPotable": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Hardness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "HardnessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AlkalinityConcentration": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "AlkalinityConcentrationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "AcidityConcentration": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "AcidityConcentrationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ImpuritiesContent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "ImpuritiesContentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "PHLevel": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "PHLevelAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "DissolvedSolidsContent": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DissolvedSolidsContentAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWindow": {
      "domain": null,
      "superclasses": [
        "IfcBuildingElement"
      ],
      "fields": {
        "OverallHeight": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallHeightAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "OverallWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "OverallWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWindowLiningProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "LiningDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LiningDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "LiningThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "LiningThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TransomThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TransomThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "MullionThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "MullionThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FirstTransomOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FirstTransomOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SecondTransomOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SecondTransomOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FirstMullionOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FirstMullionOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "SecondMullionOffset": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "SecondMullionOffsetAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShapeAspectStyle": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcWindowPanelProperties": {
      "domain": null,
      "superclasses": [
        "IfcPropertySetDefinition"
      ],
      "fields": {
        "OperationType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "PanelPosition": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "FrameDepth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FrameDepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FrameThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FrameThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "ShapeAspectStyle": {
          "type": "IfcShapeAspect",
          "reference": true,
          "many": false
        }
      }
    },
    "IfcWindowStyle": {
      "domain": null,
      "superclasses": [
        "IfcTypeProduct"
      ],
      "fields": {
        "ConstructionType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "OperationType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "ParameterTakesPrecedence": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "Sizeable": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWorkControl": {
      "domain": null,
      "superclasses": [
        "IfcControl"
      ],
      "fields": {
        "Identifier": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "CreationDate": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "Creators": {
          "type": "IfcPerson",
          "reference": true,
          "many": true
        },
        "Purpose": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "Duration": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DurationAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "TotalFloat": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "TotalFloatAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "StartTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "FinishTime": {
          "type": "IfcDateTimeSelect",
          "reference": true,
          "many": false
        },
        "WorkControlType": {
          "type": "enum",
          "reference": false,
          "many": false
        },
        "UserDefinedControlType": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWorkPlan": {
      "domain": null,
      "superclasses": [
        "IfcWorkControl"
      ],
      "fields": {}
    },
    "IfcWorkSchedule": {
      "domain": null,
      "superclasses": [
        "IfcWorkControl"
      ],
      "fields": {}
    },
    "IfcZShapeProfileDef": {
      "domain": null,
      "superclasses": [
        "IfcParameterizedProfileDef"
      ],
      "fields": {
        "Depth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "DepthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeWidth": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeWidthAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "WebThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "WebThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FlangeThickness": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FlangeThicknessAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "FilletRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "FilletRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        },
        "EdgeRadius": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "EdgeRadiusAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcZone": {
      "domain": null,
      "superclasses": [
        "IfcGroup"
      ],
      "fields": {}
    },
    "IfcAbsorbedDoseMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAccelerationMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAmountOfSubstanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAngularVelocityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcAreaMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoolean": {
      "domain": null,
      "superclasses": [
        "IfcSimpleValue",
        "IfcValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcContextDependentMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCountMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcCurvatureMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDayInMonthNumber": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDaylightSavingHour": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDescriptiveMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue",
        "IfcSizeSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDimensionCount": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDoseEquivalentMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcDynamicViscosityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricCapacitanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricChargeMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricConductanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricCurrentMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricResistanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcElectricVoltageMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcEnergyMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFontStyle": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFontVariant": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFontWeight": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcForceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcFrequencyMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcGloballyUniqueId": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcHeatFluxDensityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcHeatingValueMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcHourInDay": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcIdentifier": {
      "domain": null,
      "superclasses": [
        "IfcSimpleValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcIlluminanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcInductanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcInteger": {
      "domain": null,
      "superclasses": [
        "IfcSimpleValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcIntegerCountRateMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcIonConcentrationMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcIsothermalMoistureCapacityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcKinematicViscosityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLabel": {
      "domain": null,
      "superclasses": [
        "IfcConditionCriterionSelect",
        "IfcSimpleValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLengthMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue",
        "IfcSizeSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLinearForceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLinearMomentMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLinearStiffnessMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLinearVelocityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLogical": {
      "domain": null,
      "superclasses": [
        "IfcSimpleValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLuminousFluxMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLuminousIntensityDistributionMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcLuminousIntensityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMagneticFluxDensityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMagneticFluxMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMassDensityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMassFlowRateMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMassMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMassPerLengthMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMinuteInHour": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcModulusOfElasticityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcModulusOfLinearSubgradeReactionMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcModulusOfRotationalSubgradeReactionMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcModulusOfSubgradeReactionMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMoistureDiffusivityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMolecularWeightMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMomentOfInertiaMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMonetaryMeasure": {
      "domain": null,
      "superclasses": [
        "IfcAppliedValueSelect",
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcMonthInYearNumber": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcNumericMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPHMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcParameterValue": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue",
        "IfcTrimmingSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPlanarForceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPlaneAngleMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue",
        "IfcOrientationSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPowerMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPresentableText": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcPressureMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRadioActivityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRatioMeasure": {
      "domain": null,
      "superclasses": [
        "IfcAppliedValueSelect",
        "IfcMeasureValue",
        "IfcSizeSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcReal": {
      "domain": null,
      "superclasses": [
        "IfcSimpleValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRotationalFrequencyMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRotationalMassMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcRotationalStiffnessMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSecondInMinute": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSectionModulusMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSectionalAreaIntegralMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcShearModulusMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSolidAngleMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSoundPowerMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSoundPressureMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSpecificHeatCapacityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSpecularExponent": {
      "domain": null,
      "superclasses": [
        "IfcSpecularHighlightSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcSpecularRoughness": {
      "domain": null,
      "superclasses": [
        "IfcSpecularHighlightSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTemperatureGradientMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcText": {
      "domain": null,
      "superclasses": [
        "IfcMetricValueSelect",
        "IfcSimpleValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTextAlignment": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTextDecoration": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTextFontName": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTextTransformation": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcThermalAdmittanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcThermalConductivityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcThermalExpansionCoefficientMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcThermalResistanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcThermalTransmittanceMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcThermodynamicTemperatureMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTimeMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTimeStamp": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcTorqueMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcVaporPermeabilityMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcVolumeMeasure": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcVolumetricFlowRateMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWarpingConstantMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcWarpingMomentMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": false
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcYearNumber": {
      "domain": null,
      "superclasses": [],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcBoxAlignment": {
      "domain": null,
      "superclasses": [
        "IfcLabel"
      ],
      "fields": {}
    },
    "IfcCompoundPlaneAngleMeasure": {
      "domain": null,
      "superclasses": [
        "IfcDerivedMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "int",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcNormalisedRatioMeasure": {
      "domain": null,
      "superclasses": [
        "IfcRatioMeasure",
        "IfcColourOrFactor",
        "IfcMeasureValue",
        "IfcSizeSelect"
      ],
      "fields": {}
    },
    "IfcPositiveLengthMeasure": {
      "domain": null,
      "superclasses": [
        "IfcLengthMeasure",
        "IfcHatchLineDistanceSelect",
        "IfcMeasureValue",
        "IfcSizeSelect"
      ],
      "fields": {}
    },
    "IfcPositivePlaneAngleMeasure": {
      "domain": null,
      "superclasses": [
        "IfcPlaneAngleMeasure",
        "IfcMeasureValue"
      ],
      "fields": {}
    },
    "IfcPositiveRatioMeasure": {
      "domain": null,
      "superclasses": [
        "IfcRatioMeasure",
        "IfcMeasureValue",
        "IfcSizeSelect"
      ],
      "fields": {}
    },
    "IfcActionSourceTypeEnum": {},
    "IfcActionTypeEnum": {},
    "IfcActuatorTypeEnum": {},
    "IfcAddressTypeEnum": {},
    "IfcAheadOrBehind": {},
    "IfcAirTerminalBoxTypeEnum": {},
    "IfcAirTerminalTypeEnum": {},
    "IfcAirToAirHeatRecoveryTypeEnum": {},
    "IfcAlarmTypeEnum": {},
    "IfcAnalysisModelTypeEnum": {},
    "IfcAnalysisTheoryTypeEnum": {},
    "IfcArithmeticOperatorEnum": {},
    "IfcAssemblyPlaceEnum": {},
    "IfcBSplineCurveForm": {},
    "IfcBeamTypeEnum": {},
    "IfcBenchmarkEnum": {},
    "IfcBoilerTypeEnum": {},
    "IfcBooleanOperator": {},
    "IfcBuildingElementProxyTypeEnum": {},
    "IfcCableCarrierFittingTypeEnum": {},
    "IfcCableCarrierSegmentTypeEnum": {},
    "IfcCableSegmentTypeEnum": {},
    "IfcChangeActionEnum": {},
    "IfcChillerTypeEnum": {},
    "IfcCoilTypeEnum": {},
    "IfcColumnTypeEnum": {},
    "IfcCompressorTypeEnum": {},
    "IfcCondenserTypeEnum": {},
    "IfcConnectionTypeEnum": {},
    "IfcConstraintEnum": {},
    "IfcControllerTypeEnum": {},
    "IfcCooledBeamTypeEnum": {},
    "IfcCoolingTowerTypeEnum": {},
    "IfcCostScheduleTypeEnum": {},
    "IfcCoveringTypeEnum": {},
    "IfcCurrencyEnum": {},
    "IfcCurtainWallTypeEnum": {},
    "IfcDamperTypeEnum": {},
    "IfcDataOriginEnum": {},
    "IfcDerivedUnitEnum": {},
    "IfcDimensionExtentUsage": {},
    "IfcDirectionSenseEnum": {},
    "IfcDistributionChamberElementTypeEnum": {},
    "IfcDocumentConfidentialityEnum": {},
    "IfcDocumentStatusEnum": {},
    "IfcDoorPanelOperationEnum": {},
    "IfcDoorPanelPositionEnum": {},
    "IfcDoorStyleConstructionEnum": {},
    "IfcDoorStyleOperationEnum": {},
    "IfcDuctFittingTypeEnum": {},
    "IfcDuctSegmentTypeEnum": {},
    "IfcDuctSilencerTypeEnum": {},
    "IfcElectricApplianceTypeEnum": {},
    "IfcElectricCurrentEnum": {},
    "IfcElectricDistributionPointFunctionEnum": {},
    "IfcElectricFlowStorageDeviceTypeEnum": {},
    "IfcElectricGeneratorTypeEnum": {},
    "IfcElectricHeaterTypeEnum": {},
    "IfcElectricMotorTypeEnum": {},
    "IfcElectricTimeControlTypeEnum": {},
    "IfcElementAssemblyTypeEnum": {},
    "IfcElementCompositionEnum": {},
    "IfcEnergySequenceEnum": {},
    "IfcEnvironmentalImpactCategoryEnum": {},
    "IfcEvaporativeCoolerTypeEnum": {},
    "IfcEvaporatorTypeEnum": {},
    "IfcFanTypeEnum": {},
    "IfcFilterTypeEnum": {},
    "IfcFireSuppressionTerminalTypeEnum": {},
    "IfcFlowDirectionEnum": {},
    "IfcFlowInstrumentTypeEnum": {},
    "IfcFlowMeterTypeEnum": {},
    "IfcFootingTypeEnum": {},
    "IfcGasTerminalTypeEnum": {},
    "IfcGeometricProjectionEnum": {},
    "IfcGlobalOrLocalEnum": {},
    "IfcHeatExchangerTypeEnum": {},
    "IfcHumidifierTypeEnum": {},
    "IfcInternalOrExternalEnum": {},
    "IfcInventoryTypeEnum": {},
    "IfcJunctionBoxTypeEnum": {},
    "IfcLampTypeEnum": {},
    "IfcLayerSetDirectionEnum": {},
    "IfcLightDistributionCurveEnum": {},
    "IfcLightEmissionSourceEnum": {},
    "IfcLightFixtureTypeEnum": {},
    "IfcLoadGroupTypeEnum": {},
    "IfcLogicalOperatorEnum": {},
    "IfcMemberTypeEnum": {},
    "IfcMotorConnectionTypeEnum": {},
    "IfcNullStyleEnum": {},
    "IfcObjectTypeEnum": {},
    "IfcObjectiveEnum": {},
    "IfcOccupantTypeEnum": {},
    "IfcOutletTypeEnum": {},
    "IfcPermeableCoveringOperationEnum": {},
    "IfcPhysicalOrVirtualEnum": {},
    "IfcPileConstructionEnum": {},
    "IfcPileTypeEnum": {},
    "IfcPipeFittingTypeEnum": {},
    "IfcPipeSegmentTypeEnum": {},
    "IfcPlateTypeEnum": {},
    "IfcProcedureTypeEnum": {},
    "IfcProfileTypeEnum": {},
    "IfcProjectOrderRecordTypeEnum": {},
    "IfcProjectOrderTypeEnum": {},
    "IfcProjectedOrTrueLengthEnum": {},
    "IfcPropertySourceEnum": {},
    "IfcProtectiveDeviceTypeEnum": {},
    "IfcPumpTypeEnum": {},
    "IfcRailingTypeEnum": {},
    "IfcRampFlightTypeEnum": {},
    "IfcRampTypeEnum": {},
    "IfcReflectanceMethodEnum": {},
    "IfcReinforcingBarRoleEnum": {},
    "IfcReinforcingBarSurfaceEnum": {},
    "IfcResourceConsumptionEnum": {},
    "IfcRibPlateDirectionEnum": {},
    "IfcRoleEnum": {},
    "IfcRoofTypeEnum": {},
    "IfcSIPrefix": {},
    "IfcSIUnitName": {},
    "IfcSanitaryTerminalTypeEnum": {},
    "IfcSectionTypeEnum": {},
    "IfcSensorTypeEnum": {},
    "IfcSequenceEnum": {},
    "IfcServiceLifeFactorTypeEnum": {},
    "IfcServiceLifeTypeEnum": {},
    "IfcSlabTypeEnum": {},
    "IfcSoundScaleEnum": {},
    "IfcSpaceHeaterTypeEnum": {},
    "IfcSpaceTypeEnum": {},
    "IfcStackTerminalTypeEnum": {},
    "IfcStairFlightTypeEnum": {},
    "IfcStairTypeEnum": {},
    "IfcStateEnum": {},
    "IfcStructuralCurveTypeEnum": {},
    "IfcStructuralSurfaceTypeEnum": {},
    "IfcSurfaceSide": {},
    "IfcSurfaceTextureEnum": {},
    "IfcSwitchingDeviceTypeEnum": {},
    "IfcTankTypeEnum": {},
    "IfcTendonTypeEnum": {},
    "IfcTextPath": {},
    "IfcThermalLoadSourceEnum": {},
    "IfcThermalLoadTypeEnum": {},
    "IfcTimeSeriesDataTypeEnum": {},
    "IfcTimeSeriesScheduleTypeEnum": {},
    "IfcTransformerTypeEnum": {},
    "IfcTransitionCode": {},
    "IfcTransportElementTypeEnum": {},
    "IfcTrimmingPreference": {},
    "IfcTubeBundleTypeEnum": {},
    "IfcUnitEnum": {},
    "IfcUnitaryEquipmentTypeEnum": {},
    "IfcValveTypeEnum": {},
    "IfcVibrationIsolatorTypeEnum": {},
    "IfcWallTypeEnum": {},
    "IfcWasteTerminalTypeEnum": {},
    "IfcWindowPanelOperationEnum": {},
    "IfcWindowPanelPositionEnum": {},
    "IfcWindowStyleConstructionEnum": {},
    "IfcWindowStyleOperationEnum": {},
    "IfcWorkControlTypeEnum": {},
    "IfcComplexNumber": {
      "domain": null,
      "superclasses": [
        "IfcMeasureValue"
      ],
      "fields": {
        "wrappedValue": {
          "type": "double",
          "reference": false,
          "many": true
        },
        "wrappedValueAsString": {
          "type": "string",
          "reference": false,
          "many": true
        }
      }
    },
    "IfcNullStyle": {
      "domain": null,
      "superclasses": [
        "IfcPresentationStyleSelect"
      ],
      "fields": {
        "wrappedValue": {
          "type": "enum",
          "reference": false,
          "many": false
        }
      }
    },
    "IfcActorSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcAppliedValueSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcAxis2Placement": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcBooleanOperand": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcCharacterStyleSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcClassificationNotationSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcColour": {
      "domain": null,
      "superclasses": [
        "IfcFillStyleSelect",
        "IfcSymbolStyleSelect"
      ],
      "fields": {}
    },
    "IfcColourOrFactor": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcConditionCriterionSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcCsgSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcCurveFontOrScaledCurveFontSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcCurveOrEdgeCurve": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcCurveStyleFontSelect": {
      "domain": null,
      "superclasses": [
        "IfcCurveFontOrScaledCurveFontSelect"
      ],
      "fields": {}
    },
    "IfcDateTimeSelect": {
      "domain": null,
      "superclasses": [
        "IfcMetricValueSelect"
      ],
      "fields": {}
    },
    "IfcDefinedSymbolSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcDerivedMeasureValue": {
      "domain": null,
      "superclasses": [
        "IfcValue"
      ],
      "fields": {}
    },
    "IfcDocumentSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcDraughtingCalloutElement": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcFillAreaStyleTileShapeSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcFillStyleSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcGeometricSetSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcHatchLineDistanceSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcLayeredItem": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcLibrarySelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcLightDistributionDataSourceSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcMaterialSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcMeasureValue": {
      "domain": null,
      "superclasses": [
        "IfcValue"
      ],
      "fields": {}
    },
    "IfcMetricValueSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcObjectReferenceSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcOrientationSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcPointOrVertexPoint": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcPresentationStyleSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcShell": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcSimpleValue": {
      "domain": null,
      "superclasses": [
        "IfcValue"
      ],
      "fields": {}
    },
    "IfcSizeSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcSpecularHighlightSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcStructuralActivityAssignmentSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcSurfaceOrFaceSurface": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcSurfaceStyleElementSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcSymbolStyleSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcTextFontSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcTextStyleSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcTrimmingSelect": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcUnit": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcValue": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    },
    "IfcVectorOrDirection": {
      "domain": null,
      "superclasses": [],
      "fields": {}
    }
  }
}