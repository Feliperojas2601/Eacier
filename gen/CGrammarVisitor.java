// Generated from C:/Users/julia/Documents/Proyecto final/grammar\CGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(CGrammarParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(CGrammarParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(CGrammarParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(CGrammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(CGrammarParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CGrammarParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(CGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(CGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CGrammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CGrammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(CGrammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(CGrammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(CGrammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(CGrammarParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(CGrammarParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CGrammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CGrammarParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(CGrammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(CGrammarParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(CGrammarParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CGrammarParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(CGrammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(CGrammarParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(CGrammarParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(CGrammarParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(CGrammarParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(CGrammarParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(CGrammarParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(CGrammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(CGrammarParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(CGrammarParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(CGrammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CGrammarParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(CGrammarParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(CGrammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(CGrammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(CGrammarParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(CGrammarParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(CGrammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CGrammarParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(CGrammarParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(CGrammarParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(CGrammarParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CGrammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(CGrammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(CGrammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(CGrammarParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CGrammarParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CGrammarParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(CGrammarParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(CGrammarParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(CGrammarParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(CGrammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CGrammarParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CGrammarParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(CGrammarParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(CGrammarParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CGrammarParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CGrammarParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(CGrammarParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(CGrammarParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CGrammarParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CGrammarParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(CGrammarParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(CGrammarParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(CGrammarParser.DeclarationListContext ctx);
}