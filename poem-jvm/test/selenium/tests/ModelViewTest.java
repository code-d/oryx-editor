package tests;
import org.b3mn.poem.Identity;
import org.b3mn.poem.business.User;

import util.OryxSeleneseTestCase;

public class ModelViewTest extends OryxSeleneseTestCase {
	public void setUp() throws Exception {
		super.setUp();
		
		User user = User.CreateNewUser("http://claimid.com/oryxtest");
		
		String type = "/stencilsets/bpmn1.1/bpmn1.1.json";
		String title = "Test";
		String summary = "My Summary";
		String svg = "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:oryx=\"http://oryx-editor.org\" id=\"oryx_D42A33B2-A4C1-4723-B2B6-724CF97DB600\" width=\"325\" height=\"130\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:svg=\"http://www.w3.org/2000/svg\"><defs><marker id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3start\" refX=\"1\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"17\" markerHeight=\"11\" orient=\"auto\">      <path id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3conditional\" d=\"M 0 5 L 8 0 L 16 5 L 8 10 L 0 5\" fill=\"white\" stroke=\"black\" stroke-width=\"1\" display=\"none\"/>    <path id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3default\" d=\"M 5 0 L 11 10\" fill=\"white\" stroke=\"black\" stroke-width=\"1\" display=\"none\"/>     </marker><marker id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3end\" refX=\"15\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"15\" markerHeight=\"10\" orient=\"auto\">      <path d=\"M 0 0 L 15 5 L 0 10 L 0 0\" fill=\"black\" stroke=\"black\" stroke-width=\"1\" id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3_oryx_ED8C5562-5197-4589-848E-3B85082E0AA3_2\"/>     </marker></defs><g stroke=\"black\" font-family=\"Verdana, sans-serif\" font-size-adjust=\"none\" font-style=\"normal\" font-variant=\"normal\" font-weight=\"normal\" line-heigth=\"normal\" font-size=\"12\"><g class=\"stencils\" transform=\"translate(-169, -111)\"><g class=\"me\"/><g class=\"children\"><g id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6\"><g class=\"stencils\" transform=\"translate(194, 136)\"><g class=\"me\"><g pointer-events=\"fill\" oryx:minimumSize=\"50 40\" oryx:maximumSize=\"200 160\" id=\"\" title=\"Task\">     <rect id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6taskrect\" oryx:resize=\"vertical horizontal\" x=\"0\" y=\"0\" width=\"100\" height=\"80\" rx=\"10\" ry=\"10\" stroke=\"black\" stroke-width=\"1\" fill=\"#ffffcc\"/>      <text font-size=\"14\" id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6acttext\" x=\"50\" y=\"40\" oryx:align=\"middle center\" oryx:fittoelem=\"taskrect\" stroke=\"black\" stroke-width=\"0pt\" letter-spacing=\"-0.01px\" text-anchor=\"middle\" transform=\"rotate(0, 50, 40)\" visibility=\"inherit\"/>       <g id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6none\" display=\"inherit\"/>  <g id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6loop\" display=\"none\">       <path oryx:anchors=\"bottom\" style=\"opacity: 1; fill: none; fill-opacity: 1; stroke: rgb(0, 0, 0); stroke-width: 1.5; stroke-linecap: round; stroke-linejoin: round; stroke-miterlimit: 2.1; stroke-dasharray: none; stroke-opacity: 1;\" id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6path2396\" d=\"M 47.608384,75.188343 L 47.608384,78.188343 L 44.608384,78.188343 M 47.608384,78.188343 A 4.875,4.875 0 1 1 51.639336,78.189378\"/>     </g>  <g id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6multiple\" display=\"none\">   <path oryx:anchors=\"bottom\" fill=\"none\" stroke=\"black\" d=\"M46 70 v8 M50 70 v8 M54 70 v8\" stroke-width=\"2\" id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6_oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6_9\"/>  </g>  <g id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6compensation\" display=\"none\">   <path oryx:anchors=\"bottom\" fill=\"none\" stroke=\"black\" d=\"M 62 74 L 66 70 L 66 78 L 62 74 L 62 70 L 58 74 L 62 78 L 62 74\" stroke-width=\"1\" id=\"oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6_oryx_2579AF75-6E73-43FB-998D-5972C6B33CC6_10\"/>  </g>   </g></g><g class=\"children\" style=\"overflow: hidden;\"/><g class=\"edge\"/></g><g class=\"controls\"><g class=\"dockers\"/><g class=\"magnets\" transform=\"translate(194, 136)\"><g pointer-events=\"all\" display=\"none\" transform=\"translate(-8, 32)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(42, 72)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(92, 32)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(42, -8)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(42, 32)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g></g></g></g><g id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7\"><g class=\"stencils\" transform=\"translate(369, 136)\"><g class=\"me\"><g pointer-events=\"fill\" oryx:minimumSize=\"50 40\" oryx:maximumSize=\"200 160\" id=\"\" title=\"Task\">     <rect id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7taskrect\" oryx:resize=\"vertical horizontal\" x=\"0\" y=\"0\" width=\"100\" height=\"80\" rx=\"10\" ry=\"10\" stroke=\"black\" stroke-width=\"1\" fill=\"#ffffcc\"/>      <text font-size=\"14\" id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7acttext\" x=\"50\" y=\"40\" oryx:align=\"middle center\" oryx:fittoelem=\"taskrect\" stroke=\"black\" stroke-width=\"0pt\" letter-spacing=\"-0.01px\" text-anchor=\"middle\" transform=\"rotate(0, 50, 40)\" visibility=\"inherit\"/>       <g id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7none\" display=\"inherit\"/>  <g id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7loop\" display=\"none\">       <path oryx:anchors=\"bottom\" style=\"opacity: 1; fill: none; fill-opacity: 1; stroke: rgb(0, 0, 0); stroke-width: 1.5; stroke-linecap: round; stroke-linejoin: round; stroke-miterlimit: 2.1; stroke-dasharray: none; stroke-opacity: 1;\" id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7path2396\" d=\"M 47.608384,75.188343 L 47.608384,78.188343 L 44.608384,78.188343 M 47.608384,78.188343 A 4.875,4.875 0 1 1 51.639336,78.189378\"/>     </g>  <g id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7multiple\" display=\"none\">   <path oryx:anchors=\"bottom\" fill=\"none\" stroke=\"black\" d=\"M46 70 v8 M50 70 v8 M54 70 v8\" stroke-width=\"2\" id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7_oryx_03F423DF-B95C-4961-89CF-53FCA08119C7_9\"/>  </g>  <g id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7compensation\" display=\"none\">   <path oryx:anchors=\"bottom\" fill=\"none\" stroke=\"black\" d=\"M 62 74 L 66 70 L 66 78 L 62 74 L 62 70 L 58 74 L 62 78 L 62 74\" stroke-width=\"1\" id=\"oryx_03F423DF-B95C-4961-89CF-53FCA08119C7_oryx_03F423DF-B95C-4961-89CF-53FCA08119C7_10\"/>  </g>   </g></g><g class=\"children\" style=\"overflow: hidden;\"/><g class=\"edge\"/></g><g class=\"controls\"><g class=\"dockers\"/><g class=\"magnets\" transform=\"translate(369, 136)\"><g pointer-events=\"all\" display=\"none\" transform=\"translate(-8, 32)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(42, 72)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(92, 32)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(42, -8)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g><g pointer-events=\"all\" display=\"none\" transform=\"translate(42, 32)\"><circle cx=\"8\" cy=\"8\" r=\"4\" stroke=\"none\" fill=\"red\" fill-opacity=\"0.3\"/></g></g></g></g></g><g class=\"edge\"><g id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3\" title=\"Sequence Flow\"><g class=\"stencils\"><g class=\"me\"><g pointer-events=\"painted\"><path d=\"M294.21875 176L368.78125 176 \" stroke=\"black\" fill=\"none\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" marker-start=\"url(#oryx_ED8C5562-5197-4589-848E-3B85082E0AA3start)\" marker-end=\"url(#oryx_ED8C5562-5197-4589-848E-3B85082E0AA3end)\" id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3_1\"/><path d=\"M294.21875 176L368.78125 176 \" stroke=\"black\" fill=\"none\" stroke-width=\"10\" stroke-linecap=\"round\" stroke-linejoin=\"round\" marker-start=\"url(#oryx_ED8C5562-5197-4589-848E-3B85082E0AA3start)\" marker-end=\"url(#oryx_ED8C5562-5197-4589-848E-3B85082E0AA3end)\" id=\"undefined\" visibility=\"hidden\" stroke-dasharray=\"\"/></g><text id=\"oryx_ED8C5562-5197-4589-848E-3B85082E0AA3condition\" x=\"308.219\" y=\"162\" oryx:edgePosition=\"startTop\" stroke-width=\"0pt\" letter-spacing=\"-0.01px\" text-anchor=\"start\" transform=\"rotate(360, 294.219, 176)\" visibility=\"inherit\"/></g><g class=\"children\" style=\"overflow: hidden;\"/><g class=\"edge\"/></g><g class=\"controls\"><g class=\"dockers\"><g visibility=\"hidden\"><g pointer-events=\"all\" transform=\"translate(286.219, 168)\"><circle cx=\"8\" cy=\"8\" r=\"8\" stroke=\"none\" fill=\"none\"/><circle cx=\"8\" cy=\"8\" r=\"3\" stroke=\"black\" fill=\"#00FF00\" stroke-width=\"1\"/></g><g pointer-events=\"none\" transform=\"translate(244, 176)\"><circle cx=\"0\" cy=\"0\" r=\"3\" fill=\"red\" fill-opacity=\"0.4\"/></g></g><g visibility=\"hidden\"><g pointer-events=\"all\" transform=\"translate(360.781, 168)\"><circle cx=\"8\" cy=\"8\" r=\"8\" stroke=\"none\" fill=\"none\"/><circle cx=\"8\" cy=\"8\" r=\"3\" stroke=\"black\" fill=\"#00FF00\" stroke-width=\"1\"/></g><g pointer-events=\"none\" transform=\"translate(419, 176)\"><circle cx=\"0\" cy=\"0\" r=\"3\" fill=\"red\" fill-opacity=\"0.4\"/></g></g></g><g class=\"magnets\"/></g></g></g></g></g></svg>";
		String content = "<div id=\"oryx-canvas123\" class=\"-oryx-canvas\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#BPMNDiagram</span><span class=\"oryx-id\"></span><span class=\"oryx-name\"></span><span class=\"oryx-version\"></span><span class=\"oryx-author\"></span><span class=\"oryx-language\">English</span><span class=\"oryx-expressionlanguage\"></span><span class=\"oryx-querylanguage\"></span><span class=\"oryx-creationdate\"></span><span class=\"oryx-modificationdate\"></span><span class=\"oryx-pools\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-mode\">writable</span><span class=\"oryx-mode\">fullscreen</span><a rel=\"oryx-stencilset\" href=\"/oryx/stencilsets/bpmn1.1/bpmn1.1.json\"/><a rel=\"oryx-render\" href=\"#oryx_93923CAE-FB36-48C7-9F1F-BC21B3B2B675\"/><a rel=\"oryx-render\" href=\"#oryx_313013DB-4290-4C51-ACAE-97AFB1280931\"/><a rel=\"oryx-render\" href=\"#oryx_8517171A-FFAE-448F-A36E-6D32136B2C78\"/></div><div id=\"oryx_93923CAE-FB36-48C7-9F1F-BC21B3B2B675\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#Task</span><span class=\"oryx-id\"></span><span class=\"oryx-categories\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-name\"></span><span class=\"oryx-assignments\"></span><span class=\"oryx-pool\"></span><span class=\"oryx-lanes\"></span><span class=\"oryx-activitytype\">Task</span><span class=\"oryx-status\">None</span><span class=\"oryx-performers\"></span><span class=\"oryx-properties\"></span><span class=\"oryx-inputsets\"></span><span class=\"oryx-inputs\"></span><span class=\"oryx-outputsets\"></span><span class=\"oryx-outputs\"></span><span class=\"oryx-iorules\"></span><span class=\"oryx-startquantity\">1</span><span class=\"oryx-completionquantity\">1</span><span class=\"oryx-looptype\">None</span><span class=\"oryx-loopcondition\"></span><span class=\"oryx-loopcounter\">1</span><span class=\"oryx-loopmaximum\">1</span><span class=\"oryx-testtime\">After</span><span class=\"oryx-mi_condition\"></span><span class=\"oryx-mi_ordering\">Sequential</span><span class=\"oryx-mi_flowcondition\">All</span><span class=\"oryx-complexmi_condition\"></span><span class=\"oryx-iscompensation\"></span><span class=\"oryx-tasktype\">None</span><span class=\"oryx-inmessage\"></span><span class=\"oryx-outmessage\"></span><span class=\"oryx-implementation\">Webservice</span><span class=\"oryx-messageref\"></span><span class=\"oryx-instantiate\"></span><span class=\"oryx-script\"></span><span class=\"oryx-taskref\"></span><span class=\"oryx-bgcolor\">#ffffcc</span><span class=\"oryx-bounds\">194,136,294,216</span><a rel=\"raziel-outgoing\" href=\"#oryx_8517171A-FFAE-448F-A36E-6D32136B2C78\"/><a rel=\"raziel-parent\" href=\"#oryx-canvas123\"/></div><div id=\"oryx_313013DB-4290-4C51-ACAE-97AFB1280931\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#Task</span><span class=\"oryx-id\"></span><span class=\"oryx-categories\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-name\"></span><span class=\"oryx-assignments\"></span><span class=\"oryx-pool\"></span><span class=\"oryx-lanes\"></span><span class=\"oryx-activitytype\">Task</span><span class=\"oryx-status\">None</span><span class=\"oryx-performers\"></span><span class=\"oryx-properties\"></span><span class=\"oryx-inputsets\"></span><span class=\"oryx-inputs\"></span><span class=\"oryx-outputsets\"></span><span class=\"oryx-outputs\"></span><span class=\"oryx-iorules\"></span><span class=\"oryx-startquantity\">1</span><span class=\"oryx-completionquantity\">1</span><span class=\"oryx-looptype\">None</span><span class=\"oryx-loopcondition\"></span><span class=\"oryx-loopcounter\">1</span><span class=\"oryx-loopmaximum\">1</span><span class=\"oryx-testtime\">After</span><span class=\"oryx-mi_condition\"></span><span class=\"oryx-mi_ordering\">Sequential</span><span class=\"oryx-mi_flowcondition\">All</span><span class=\"oryx-complexmi_condition\"></span><span class=\"oryx-iscompensation\"></span><span class=\"oryx-tasktype\">None</span><span class=\"oryx-inmessage\"></span><span class=\"oryx-outmessage\"></span><span class=\"oryx-implementation\">Webservice</span><span class=\"oryx-messageref\"></span><span class=\"oryx-instantiate\"></span><span class=\"oryx-script\"></span><span class=\"oryx-taskref\"></span><span class=\"oryx-bgcolor\">#ffffcc</span><span class=\"oryx-bounds\">369,136,469,216</span><a rel=\"raziel-parent\" href=\"#oryx-canvas123\"/></div><div id=\"oryx_8517171A-FFAE-448F-A36E-6D32136B2C78\"><span class=\"oryx-type\">http://b3mn.org/stencilset/bpmn1.1#SequenceFlow</span><span class=\"oryx-id\"></span><span class=\"oryx-categories\"></span><span class=\"oryx-documentation\"></span><span class=\"oryx-name\"></span><span class=\"oryx-sourceref\"></span><span class=\"oryx-targetref\"></span><span class=\"oryx-conditiontype\">None</span><span class=\"oryx-conditionexpression\"></span><span class=\"oryx-quantity\">1</span><span class=\"oryx-showdiamondmarker\">false</span><span class=\"oryx-bounds\">294.21875,176,368.78125,176</span><a rel=\"raziel-outgoing\" href=\"#oryx_313013DB-4290-4C51-ACAE-97AFB1280931\"/><a rel=\"raziel-parent\" href=\"#oryx-canvas123\"/><span class=\"oryx-dockers\">50 40 50 40  # </span><a rel=\"raziel-target\" href=\"#oryx_313013DB-4290-4C51-ACAE-97AFB1280931\"/></div>";
//		Identity identity = 
			Identity.newModel(user.getIdentity(), title, type, summary, svg, content);
	}
	public void testIconView() throws Exception {
		selenium.open("/backend/poem/repository");
		//this.createModelRepository("", true);
		selenium.click("css=button[style*=shape_square_add.png]");
	}
}