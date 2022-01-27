// Generated from C:/Users/PERSONAL/Documents/Proyectos/Independientes/Lenguajes de Programación/Eacier/grammar\CGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CGrammarParser}.
 */
public interface CGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(CGrammarParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(CGrammarParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(CGrammarParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(CGrammarParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(CGrammarParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(CGrammarParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(CGrammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(CGrammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CGrammarParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CGrammarParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CGrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CGrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CGrammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CGrammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CGrammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CGrammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(CGrammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(CGrammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(CGrammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(CGrammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(CGrammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(CGrammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CGrammarParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CGrammarParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CGrammarParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CGrammarParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CGrammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CGrammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CGrammarParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CGrammarParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(CGrammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(CGrammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(CGrammarParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(CGrammarParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(CGrammarParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(CGrammarParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CGrammarParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CGrammarParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(CGrammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(CGrammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(CGrammarParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(CGrammarParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(CGrammarParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(CGrammarParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(CGrammarParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(CGrammarParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(CGrammarParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(CGrammarParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CGrammarParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CGrammarParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(CGrammarParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(CGrammarParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(CGrammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(CGrammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(CGrammarParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(CGrammarParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(CGrammarParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(CGrammarParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(CGrammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(CGrammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CGrammarParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CGrammarParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(CGrammarParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(CGrammarParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(CGrammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(CGrammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(CGrammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(CGrammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(CGrammarParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(CGrammarParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(CGrammarParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(CGrammarParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(CGrammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(CGrammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CGrammarParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CGrammarParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(CGrammarParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(CGrammarParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(CGrammarParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(CGrammarParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CGrammarParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CGrammarParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(CGrammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(CGrammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(CGrammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(CGrammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CGrammarParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CGrammarParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CGrammarParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CGrammarParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CGrammarParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CGrammarParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(CGrammarParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(CGrammarParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(CGrammarParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(CGrammarParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(CGrammarParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(CGrammarParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(CGrammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(CGrammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CGrammarParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CGrammarParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CGrammarParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CGrammarParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CGrammarParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CGrammarParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CGrammarParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CGrammarParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CGrammarParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CGrammarParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CGrammarParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CGrammarParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(CGrammarParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(CGrammarParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(CGrammarParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(CGrammarParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CGrammarParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CGrammarParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CGrammarParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CGrammarParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(CGrammarParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(CGrammarParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(CGrammarParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(CGrammarParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGrammarParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(CGrammarParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGrammarParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(CGrammarParser.DeclarationListContext ctx);
}