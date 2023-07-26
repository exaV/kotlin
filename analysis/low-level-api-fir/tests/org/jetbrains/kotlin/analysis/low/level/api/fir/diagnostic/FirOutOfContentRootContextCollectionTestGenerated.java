/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.diagnostic;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testdata/fileStructure")
@TestDataPath("$PROJECT_ROOT")
public class FirOutOfContentRootContextCollectionTestGenerated extends AbstractFirOutOfContentRootContextCollectionTest {
    @Test
    public void testAllFilesPresentInFileStructure() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testdata/fileStructure"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
    }

    @Test
    @TestMetadata("annonymousClass.kt")
    public void testAnnonymousClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/annonymousClass.kt");
    }

    @Test
    @TestMetadata("callInsideLambdaInsideSuperCallAndExplicitConstructor.kt")
    public void testCallInsideLambdaInsideSuperCallAndExplicitConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/callInsideLambdaInsideSuperCallAndExplicitConstructor.kt");
    }

    @Test
    @TestMetadata("callInsideLambdaInsideSuperCallAndImplicitConstructor.kt")
    public void testCallInsideLambdaInsideSuperCallAndImplicitConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/callInsideLambdaInsideSuperCallAndImplicitConstructor.kt");
    }

    @Test
    @TestMetadata("callInsideLambdaInsideSuperCallFromSecondaryConstructor.kt")
    public void testCallInsideLambdaInsideSuperCallFromSecondaryConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/callInsideLambdaInsideSuperCallFromSecondaryConstructor.kt");
    }

    @Test
    @TestMetadata("callInsideLambdaInsideSuperCallFromSingleSecondaryConstructor.kt")
    public void testCallInsideLambdaInsideSuperCallFromSingleSecondaryConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/callInsideLambdaInsideSuperCallFromSingleSecondaryConstructor.kt");
    }

    @Test
    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/class.kt");
    }

    @Test
    @TestMetadata("class2.kt")
    public void testClass2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/class2.kt");
    }

    @Test
    @TestMetadata("classMemberProperty.kt")
    public void testClassMemberProperty() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/classMemberProperty.kt");
    }

    @Test
    @TestMetadata("constructorParameter.kt")
    public void testConstructorParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/constructorParameter.kt");
    }

    @Test
    @TestMetadata("constructorParameter2.kt")
    public void testConstructorParameter2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/constructorParameter2.kt");
    }

    @Test
    @TestMetadata("constructorParameterWithAnnotations.kt")
    public void testConstructorParameterWithAnnotations() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/constructorParameterWithAnnotations.kt");
    }

    @Test
    @TestMetadata("constructors.kt")
    public void testConstructors() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/constructors.kt");
    }

    @Test
    @TestMetadata("danglingAnnotationClassLevel.kt")
    public void testDanglingAnnotationClassLevel() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/danglingAnnotationClassLevel.kt");
    }

    @Test
    @TestMetadata("danglingAnnotationTopLevel.kt")
    public void testDanglingAnnotationTopLevel() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/danglingAnnotationTopLevel.kt");
    }

    @Test
    @TestMetadata("declarationsInPropertyInit.kt")
    public void testDeclarationsInPropertyInit() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/declarationsInPropertyInit.kt");
    }

    @Test
    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/enum.kt");
    }

    @Test
    @TestMetadata("enumClass.kt")
    public void testEnumClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/enumClass.kt");
    }

    @Test
    @TestMetadata("enumClassWithBody.kt")
    public void testEnumClassWithBody() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/enumClassWithBody.kt");
    }

    @Test
    @TestMetadata("funWithoutTypes.kt")
    public void testFunWithoutTypes() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/funWithoutTypes.kt");
    }

    @Test
    @TestMetadata("functionValueParameter.kt")
    public void testFunctionValueParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/functionValueParameter.kt");
    }

    @Test
    @TestMetadata("functionWithImplicitType.kt")
    public void testFunctionWithImplicitType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/functionWithImplicitType.kt");
    }

    @Test
    @TestMetadata("functionalType.kt")
    public void testFunctionalType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/functionalType.kt");
    }

    @Test
    @TestMetadata("initBlock.kt")
    public void testInitBlock() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/initBlock.kt");
    }

    @Test
    @TestMetadata("lambda.kt")
    public void testLambda() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/lambda.kt");
    }

    @Test
    @TestMetadata("lambdaInImplicitFunBody.kt")
    public void testLambdaInImplicitFunBody() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/lambdaInImplicitFunBody.kt");
    }

    @Test
    @TestMetadata("lambdaInImplicitPropertyBody.kt")
    public void testLambdaInImplicitPropertyBody() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/lambdaInImplicitPropertyBody.kt");
    }

    @Test
    @TestMetadata("lambdasInWithBodyFunction.kt")
    public void testLambdasInWithBodyFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/lambdasInWithBodyFunction.kt");
    }

    @Test
    @TestMetadata("localClass.kt")
    public void testLocalClass() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/localClass.kt");
    }

    @Test
    @TestMetadata("localClass2.kt")
    public void testLocalClass2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/localClass2.kt");
    }

    @Test
    @TestMetadata("localDeclarationsInAccessor.kt")
    public void testLocalDeclarationsInAccessor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/localDeclarationsInAccessor.kt");
    }

    @Test
    @TestMetadata("localFun.kt")
    public void testLocalFun() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/localFun.kt");
    }

    @Test
    @TestMetadata("localFunctionWithImplicitType.kt")
    public void testLocalFunctionWithImplicitType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/localFunctionWithImplicitType.kt");
    }

    @Test
    @TestMetadata("localProperty.kt")
    public void testLocalProperty() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/localProperty.kt");
    }

    @Test
    @TestMetadata("localUnitFunction.kt")
    public void testLocalUnitFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/localUnitFunction.kt");
    }

    @Test
    @TestMetadata("memberFunctions.kt")
    public void testMemberFunctions() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/memberFunctions.kt");
    }

    @Test
    @TestMetadata("memberProperties.kt")
    public void testMemberProperties() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/memberProperties.kt");
    }

    @Test
    @TestMetadata("memberTypeAlias.kt")
    public void testMemberTypeAlias() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/memberTypeAlias.kt");
    }

    @Test
    @TestMetadata("multipleTopLevelClasses.kt")
    public void testMultipleTopLevelClasses() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/multipleTopLevelClasses.kt");
    }

    @Test
    @TestMetadata("multipleTopLevelFunctionsWithImplicitTypes.kt")
    public void testMultipleTopLevelFunctionsWithImplicitTypes() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/multipleTopLevelFunctionsWithImplicitTypes.kt");
    }

    @Test
    @TestMetadata("multipleTopLevelUnitFunctions.kt")
    public void testMultipleTopLevelUnitFunctions() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/multipleTopLevelUnitFunctions.kt");
    }

    @Test
    @TestMetadata("nestedClases.kt")
    public void testNestedClases() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/nestedClases.kt");
    }

    @Test
    @TestMetadata("nestedClasesWithFun.kt")
    public void testNestedClasesWithFun() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/nestedClasesWithFun.kt");
    }

    @Test
    @TestMetadata("nestedClasses.kt")
    public void testNestedClasses() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/nestedClasses.kt");
    }

    @Test
    @TestMetadata("propertyAccessors.kt")
    public void testPropertyAccessors() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/propertyAccessors.kt");
    }

    @Test
    @TestMetadata("propertyWithGetterAndSetter.kt")
    public void testPropertyWithGetterAndSetter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/propertyWithGetterAndSetter.kt");
    }

    @Test
    @TestMetadata("propertyWithSetter.kt")
    public void testPropertyWithSetter() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/propertyWithSetter.kt");
    }

    @Test
    @TestMetadata("qualifiedCallInsideSuperCall.kt")
    public void testQualifiedCallInsideSuperCall() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/qualifiedCallInsideSuperCall.kt");
    }

    @Test
    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/secondaryConstructor.kt");
    }

    @Test
    @TestMetadata("superCallAnnotation.kt")
    public void testSuperCallAnnotation() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/superCallAnnotation.kt");
    }

    @Test
    @TestMetadata("superCallAnnotation2.kt")
    public void testSuperCallAnnotation2() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/superCallAnnotation2.kt");
    }

    @Test
    @TestMetadata("superClassCall.kt")
    public void testSuperClassCall() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/superClassCall.kt");
    }

    @Test
    @TestMetadata("superType.kt")
    public void testSuperType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/superType.kt");
    }

    @Test
    @TestMetadata("topLevelExpressionBodyFunWithType.kt")
    public void testTopLevelExpressionBodyFunWithType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/topLevelExpressionBodyFunWithType.kt");
    }

    @Test
    @TestMetadata("topLevelExpressionBodyFunWithoutType.kt")
    public void testTopLevelExpressionBodyFunWithoutType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/topLevelExpressionBodyFunWithoutType.kt");
    }

    @Test
    @TestMetadata("topLevelFunWithType.kt")
    public void testTopLevelFunWithType() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/topLevelFunWithType.kt");
    }

    @Test
    @TestMetadata("topLevelProperty.kt")
    public void testTopLevelProperty() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/topLevelProperty.kt");
    }

    @Test
    @TestMetadata("topLevelUnitFun.kt")
    public void testTopLevelUnitFun() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/topLevelUnitFun.kt");
    }

    @Test
    @TestMetadata("typeAlias.kt")
    public void testTypeAlias() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/typeAlias.kt");
    }

    @Test
    @TestMetadata("withoutName.kt")
    public void testWithoutName() throws Exception {
        runTest("analysis/low-level-api-fir/testdata/fileStructure/withoutName.kt");
    }
}
